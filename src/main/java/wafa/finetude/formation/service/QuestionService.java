package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Question;

public interface QuestionService {

	Question saveQuestion(Question question);

	Question updateQuestion(Question question);

	void deleteQuestion(Question question);

	void deleteQuesById(Long id);

	Question getQuesById(Long id);

	List<Question> getAllQuestions();

	List<Question> findByFormationIdFor(Long id);
    List<Question> findByFormateurId(Long id);

}
