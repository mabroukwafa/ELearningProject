package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Employe;

/**
 * Interface de repository pour l'entité Employe.
 * Utilise Spring Data JPA pour faciliter l'accès et la manipulation des données
 * des administrateurs.
 * - Utilise Spring Data REST (@RepositoryRestResource) pour exposer
 * automatiquement des services web REST.
 * - Le chemin d'accès au service web est défini comme 'employe', rendant les
 * données facilement accessibles via HTTP.
 * - Les fonctionnalités incluent les opérations CRUD de base, sans nécessiter
 * de code supplémentaire pour les contrôleurs REST.
 *
 * Grâce à Spring Data REST, on peut interagir avec les données d'attributions
 * de formation via des requêtes HTTP simples.
 */

@RepositoryRestResource(collectionResourceRel = "employe", path = "employe")

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    List<Employe> findByUsername(String username);
}
