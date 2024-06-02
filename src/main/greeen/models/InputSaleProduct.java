package greeen.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "InputSaleProduct")
public class InputSaleProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_produit", nullable = false)
    private String typeProduit;
    // @Lob
    // @Column(name = "image_produit")
    // private byte[] imageProduit;
    @Column(name = "image_produit")
    private String imageProduit;

    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "unite", nullable = false)
    private String unite;

    @Column(name = "quantite", nullable = false)
    private double quantite;
}
