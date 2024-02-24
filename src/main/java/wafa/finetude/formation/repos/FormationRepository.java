package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.Formation;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "formation", path = "formation")

public interface FormationRepository extends JpaRepository<Formation, Long> {

    List<Formation> findByTitre(String titre);

    @Query("select formation from Formation formation where formation.formateur = ?1")
    List<Formation> findByFormateur(Formateur formateur);

    List<Formation> findByFormateurUsername(String username);

    List<Formation> findByFormateurId(Long id);

    List<Formation> findByCategorieNomCat(String nomCateg);

}
