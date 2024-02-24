package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wafa.finetude.formation.entities.Categorie;
import wafa.finetude.formation.service.CategorieService;


@RestController
@RequestMapping("/categorie")
@CrossOrigin
public class CategorieRestController {

    @Autowired
    CategorieService categorieService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Categorie> getAllCategs() {
        return categorieService.getAllCateg();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Categorie createCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCategorie(@PathVariable("id") Long id) {
        categorieService.deleteCategById(id);
    }

}
