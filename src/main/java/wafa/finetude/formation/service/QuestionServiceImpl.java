package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.Question;
import wafa.finetude.formation.repos.AdminRepository;
import wafa.finetude.formation.repos.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question admin) {
        return questionRepository.save(admin);

    }

    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public void deleteQuesById(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Question getQuesById(Long id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> findByFormationIdFor(Long id) {
        return questionRepository.findByFormationIdFor(id);
    }

    @Override
    public List<Question> findByFormateurId(Long id) {
        return questionRepository.findByFormateurId(id);

    }

}
