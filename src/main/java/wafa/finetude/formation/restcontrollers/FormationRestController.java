package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.hibernate.type.descriptor.java.LongJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wafa.finetude.formation.entities.Formation;
import wafa.finetude.formation.service.FormationService;

@RestController
@RequestMapping("/formation")
@CrossOrigin(origins = "*")
public class FormationRestController {

    @Autowired
    FormationService formationService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Formation> getAllFormations() {
        return formationService.getAllFormations();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Formation getFormationById(@PathVariable("id") Long id) {
        return formationService.getFormation(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Formation createFormation(@RequestBody Formation formation) {
        return formationService.saveFormation(formation);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Formation updateFormation(@RequestBody Formation formation) {
        return formationService.updateFormation(formation);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteFormation(@PathVariable("id") Long id) {
        formationService.deleteformationById(id);
        ;
    }

    @RequestMapping(value = "/findByTitre/{nom}", method = RequestMethod.GET)
    public List<Formation> getFormationByTitre(@PathVariable("nom") String nom) {
        return formationService.findByTitre(nom);
    }

    @RequestMapping(value = "/findByForUsername/{nom}", method = RequestMethod.GET)
    public List<Formation> getFormationByFor(@PathVariable("nom") String nom) {
        return formationService.findByFormateurNom(nom);
    }

    @RequestMapping(value = "/findByForId/{id}", method = RequestMethod.GET)
    public List<Formation> getFormationByForId(@PathVariable("id") Long id) {
        return formationService.findByFormateurId(id);
    }

    @RequestMapping(value = "/findByCateg/{id}", method = RequestMethod.GET)
    public List<Formation> getFormationByCateg(@PathVariable("id") Long id) {
        return formationService.findByCategorieIdCat(id);
    }
}
