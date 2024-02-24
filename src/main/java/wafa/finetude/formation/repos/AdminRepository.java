package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Admin;

/**
 * Interface de repository pour l'entité Admin.
 * Utilise Spring Data JPA pour faciliter l'accès et la manipulation des données
 * des administrateurs.
 * - Utilise Spring Data REST (@RepositoryRestResource) pour exposer
 * automatiquement des services web REST.
 * - Le chemin d'accès au service web est défini comme 'admin', rendant les
 * données facilement accessibles via HTTP.
 * - Les fonctionnalités incluent les opérations CRUD de base, sans nécessiter
 * de code supplémentaire pour les contrôleurs REST.
 *
 * Grâce à Spring Data REST, on peut interagir avec les données d'attributions
 * de formation via des requêtes HTTP simples.
 */

//@RepositoryRestResource(collectionResourceRel = "admin", path = "admin")

/**
 * Cette méthode permet de récupérer une liste d'administrateurs en fonction de
 * leur nom d'utilisateur.
 * L'URL pour accéder à cette méthode via une requête HTTP serait :
 * http://localhost:8080/formations/admin/search/findByUsername?username=nom
 */

public interface AdminRepository extends JpaRepository<Admin, Long> {
     List<Admin> findByUsername(String nom);
}
