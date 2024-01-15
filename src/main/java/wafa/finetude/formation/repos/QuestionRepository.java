package wafa.finetude.formation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Question;

@RepositoryRestResource(collectionResourceRel = "question", path = "question")

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
