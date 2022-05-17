package kounet.technologie;

import kounet.technologie.entity.Clients;
import kounet.technologie.entity.Foumisseur;
import kounet.technologie.entity.Produits;
import kounet.technologie.repository.ImplementClient;
import kounet.technologie.repository.ImplementFournisseurs;
import kounet.technologie.repository.ImplementProduit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class MarchandisesServices01Application implements CommandLineRunner {
ImplementClient implementClient;
ImplementFournisseurs implementFournisseurs;
ImplementProduit implementProduit;
    public static void main(String[] args) {
        SpringApplication.run(MarchandisesServices01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        implementClient.save(new Clients(null, "oumar","tunis","kounet@gmail.com",506966,new Date()));
        implementFournisseurs.save(new Foumisseur(null,"diallo","tunis","kounet@gmail.com",new Date()));
        implementProduit.save(new Produits(null,))
    }
}
