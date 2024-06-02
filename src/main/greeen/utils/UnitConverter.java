package greeen.utils;

public class UnitConverter {
    public static double convert(double quantity, String fromUnit, String toUnit) {
        if (fromUnit.equals(toUnit)) {
            
            System.out.println(toUnit);
            System.out.println(fromUnit);
            return quantity;
        }

        switch (fromUnit) {

            case "Kg":
                if (toUnit.equals("Tone")) return quantity / 1000;
                if (toUnit.equals("G")) return quantity * 1000;
                if (toUnit.equals("Mg")) return quantity * 1_000_000;
                break;
            case "Tone":
                if (toUnit.equals("Kg")) return quantity * 1000;
                if (toUnit.equals("G")) return quantity * 1_000_000;
                if (toUnit.equals("Mg")) return quantity * 1_000_000_000;
                break;
            case "G":
                if (toUnit.equals("Kg")) return quantity / 1000;
                if (toUnit.equals("Tone")) return quantity / 1_000_000;
                if (toUnit.equals("Mg")) return quantity * 1000;
                break;
            case "Litre":
                if (toUnit.equals("ml")) return quantity * 1000;
                break;
            case "ml":
                if (toUnit.equals("Litre")) return quantity / 1000;
                break;
            case "m":
                if (toUnit.equals("cm")) return quantity * 100;
                break;
            case "cm":
                if (toUnit.equals("m")) return quantity / 100;
                break;
        }

        throw new IllegalArgumentException("Unsupported unit conversion");
    }

}
