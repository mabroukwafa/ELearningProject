package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.Question;
import wafa.finetude.formation.service.AdminService;
import wafa.finetude.formation.service.QuestionService;

@RestController
@RequestMapping("/questions")
@CrossOrigin
public class QuestionRestController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Question getQuestionById(@PathVariable("id") Long id) {
        return questionService.getQuesById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Question createQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Question updateQuestion(@RequestBody Question question) {
        return questionService.updateQuestion(question);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteQuestion(@PathVariable("id") Long id) {
        questionService.deleteQuesById(id);
    }

    @RequestMapping(value = "findByFormation/{id}", method = RequestMethod.GET)
    public List<Question> getQuestionByFormation(@PathVariable("id") Long id) {
        return questionService.findByFormationIdFor(id);
    }

    @RequestMapping(value = "findByFormateur/{id}", method = RequestMethod.GET)
    public List<Question> getQuestionByFormateur(@PathVariable("id") Long id) {
        return questionService.findByFormateurId(id);
    }

}
