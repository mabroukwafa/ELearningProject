package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.service.EmployeService;

@RestController
@RequestMapping("/employe")
@CrossOrigin

public class EmployeRestController {
    @Autowired
    EmployeService employeService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employe getEmployeById(@PathVariable("id") Long id) {
        return employeService.getEmploye(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmploye(@PathVariable("id") Long id) {
        employeService.deleteEmployeById(id);
    }

    @RequestMapping(value = "/findByNom/{nom}", method = RequestMethod.GET)
    public List<Employe> getEmployeByNom(@PathVariable("nom") String nom) {
        return employeService.findByUsername(nom);
    }
}
