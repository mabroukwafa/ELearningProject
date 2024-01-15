package wafa.finetude.formation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String nom);
    // http:// localhost:8080/formations/admin/search/findByNom?nom=toto

}
