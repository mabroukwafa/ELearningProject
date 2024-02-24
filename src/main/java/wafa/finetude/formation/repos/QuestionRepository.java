package wafa.finetude.formation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wafa.finetude.formation.entities.Question;

//@RepositoryRestResource(collectionResourceRel = "question", path = "question")

public interface QuestionRepository extends JpaRepository<Question, Long> {

        List<Question> findByFormationIdFor(Long id);
        List<Question> findByFormateurId(Long id);

}
