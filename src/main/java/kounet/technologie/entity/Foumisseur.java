package kounet.technologie.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foumisseur implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fournisseur;
    @NotNull
    private String nom;
    private String adress;
    private String email;
    private int cotactes;
  //  private Date datecreation;
}
