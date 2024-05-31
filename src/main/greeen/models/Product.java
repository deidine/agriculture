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
    private String categorie;
    private int quantityPurchase;
    private int quantitySalle;

}