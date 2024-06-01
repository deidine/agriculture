package greeen.utils;

public class UnitConverter {

    public static double toMainUnit(double quantity, String fromUnit, String mainUnit) {
        if (fromUnit.equals(mainUnit)) {
            return quantity;
        }

        switch (mainUnit) {
            case "g": // Grams
                if (fromUnit.equals("kg"))
                    return quantity * 1000;
                if (fromUnit.equals("tonne"))
                    return quantity * 1_000_000;
                break;
            case "ml": // Milliliters
                if (fromUnit.equals("litre"))
                    return quantity * 1000;
                break;
            case "mm": // Millimeters
                if (fromUnit.equals("m"))
                    return quantity * 1000;
                break;
            // Add other conversions as necessary
        }

        throw new IllegalArgumentException("Unsupported unit conversion");
    }

    public static double fromMainUnit(double quantity, String toUnit, String mainUnit) {
        if (toUnit.equals(mainUnit)) {
            return quantity;
        }

        switch (mainUnit) {
            case "g": // Grams
                if (toUnit.equals("kg"))
                    return quantity / 1000;
                if (toUnit.equals("tonne"))
                    return quantity / 1_000_000;
                break;
            case "ml": // Milliliters
                if (toUnit.equals("litre"))
                    return quantity / 1000;
                break;
            case "mm": // Millimeters
                if (toUnit.equals("m"))
                    return quantity / 1000;
                break;
            // Add other conversions as necessary
        }

        throw new IllegalArgumentException("Unsupported unit conversion");
    }

    public static double convert(double quantity, String fromUnit, String toUnit) {
        if (fromUnit.equals(toUnit)) {
            System.out.println(toUnit);
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
