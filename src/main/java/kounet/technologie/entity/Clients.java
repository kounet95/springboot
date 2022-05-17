package kounet.technologie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clients implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    @NotNull
    private String nom;
    private String adress;
    private String email;
    private int cotactes;
    private Date datecreation;
}
