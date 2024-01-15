package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Formateur;

/**
 * Interface de repository pour l'entité Formateur.
 * Utilise Spring Data JPA pour faciliter l'accès et la manipulation des données
 * des administrateurs.
 * - Utilise Spring Data REST (@RepositoryRestResource) pour exposer
 * automatiquement des services web REST.
 * - Le chemin d'accès au service web est défini comme 'formateur', rendant les
 * données facilement accessibles via HTTP.
 * - Les fonctionnalités incluent les opérations CRUD de base, sans nécessiter
 * de code supplémentaire pour les contrôleurs REST.
 *
 * Grâce à Spring Data REST, on peut interagir avec les données d'attributions
 * de formation via des requêtes HTTP simples.
 */

@RepositoryRestResource(collectionResourceRel = "formateur", path = "formateur")

public interface FormateurRepository extends JpaRepository<Formateur, Long> {
    List<Formateur> findByUsername(String username);


    /**
     * Trouve un formateur associé à une formation spécifique.
     * Cette méthode utilise une requête JPQL personnalisée pour récupérer le formateur.
     * La requête sélectionne le formateur de l'entité Formation où l'identifiant de la formation correspond à l'id spécifié.
     * */
    @Query("SELECT f.formateur FROM Formation f WHERE f.id = :idFor")
    Formateur findFormateurByFormationId(@Param("idFor") Long idFor);

}
