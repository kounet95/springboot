package kounet.technologie.repository;

import kounet.technologie.entity.Produits;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ImplementProduit extends JpaRepository<Produits,Long>{
    @Query("select p from Produits p where p.designation like :x")
    public Page <Produits> chercherProduit(@Param("x") String mc, Pageable pageable);


    public Page <Produits> findByDesignationContains(String mc,Pageable pageable);
}
