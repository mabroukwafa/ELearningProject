package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.AttributionFormation;
import wafa.finetude.formation.entities.Question;

/**
 * Interface de Repository pour les attributions de formation.
 * 
 * - Étend JpaRepository pour une gestion simplifiée des opérations de base de
 * données.
 * - Utilise Spring Data REST (@RepositoryRestResource) pour exposer
 * automatiquement ces opérations comme des services web REST.
 * - Le chemin d'accès au service web est défini comme 'attFormation', rendant
 * les données facilement accessibles via HTTP.
 * - Les fonctionnalités incluent les opérations CRUD de base, sans nécessiter
 * de code supplémentaire pour les contrôleurs REST.
 *
 * Grâce à Spring Data REST, on peut interagir avec les données d'attributions
 * de formation via des requêtes HTTP simples.
 */

// @RepositoryRestResource(collectionResourceRel = "attFormation", path = "attFormation")
public interface AttributionFormationRepository extends JpaRepository<AttributionFormation, Long> {

    List<AttributionFormation> findByEmployeId(Long id);

}
