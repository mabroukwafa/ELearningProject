package wafa.finetude.formation.service;


import java.util.List;



import wafa.finetude.formation.entities.Question;

public interface QuestionService {
	
	 Question saveQuestion(Question question);
	 Question updateQuestion(Question question);
	 void deleteQuestion(Question question);
     void deleteQuestionById(Long id);
	 Question getQuestion(Long id);
	 List<Question> getAllQuestions();
	 
	 List<Question> findByIdQues(String nom);
	 //List<Question> findByNomProduitContains(String nom);
	 //List<Question> findByNomPrix (String nom, Double prix);
	

}
    

