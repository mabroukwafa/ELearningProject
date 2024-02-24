package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.service.FormateurService;

@RestController
@RequestMapping("/formateur")
@CrossOrigin
public class FormateurRestController {
    @Autowired
    FormateurService formateurService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Formateur> getAllFormateurs() {
        return formateurService.getAllFormateurs();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Formateur getFormateurById(@PathVariable("id") Long id) {
        return formateurService.getFormateur(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Formateur createFormateur(@RequestBody Formateur formateur) {
        return formateurService.saveFormateur(formateur);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Formateur updateFormateur(@RequestBody Formateur formateur) {
        return formateurService.updateFormateur(formateur);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteFormateur(@PathVariable("id") Long id) {
        formateurService.deleteFormateurById(id);
    }

    @RequestMapping(value = "/findByNom/{nom}", method = RequestMethod.GET)
    public List<Formateur> getFormateurByNom(@PathVariable("nom") String nom) {
        return formateurService.findByUsername(nom);
    }

}
