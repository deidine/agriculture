package greeen.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import lombok.Getter;
import lombok.Setter;

@Entity
// @Table(name = "products")
@Getter
@Setter
public class Product {

    @Id
    private String productcode;

    private String productname;
    private double costprice;
    private double sellprice;
    private String brand;
    private int quantity;

}