package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.Formation;

@RepositoryRestResource(collectionResourceRel = "formation", path = "formation")

public interface FormationRepository extends JpaRepository<Formation, Long> {

    List<Formation> findByTitre(String titre);

    @Query("select formation from Formation formation where formation.formateur = ?1")
    List<Formation> findByFormateur(Formateur formateur);

    List<Formation> findByFormateurUsername(String username);
}
