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

    @Column(name = "image_produit")
    private String imageProduit;

    @Column(name = "unite", nullable = false)
    private String unite;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;
}
