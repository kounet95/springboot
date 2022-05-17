package kounet.technologie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produits implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_prod;
    private String designation;
    private double prix;
    private int quantite;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idFournisseur", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Foumisseur fournisseur;
}
