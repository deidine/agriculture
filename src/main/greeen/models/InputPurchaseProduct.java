package greeen.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "InputPurchaseProduct")  
public class InputPurchaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @Column(name = "categorie_produit", nullable = false)
    private String categorieProduit;  
    @Column(name = "nom_produit", nullable = false)
    private String nomProduit;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;  
    @Column(name = "unite", nullable = false)
    private String unite;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "date_achat", nullable = false)
    private LocalDate dateAchat;  
    @Column(name = "date_expiration")
    private LocalDate dateExpiration;  
    @Column(name = "utilisation",length = 122222)
    private String utilisation;

 
}
