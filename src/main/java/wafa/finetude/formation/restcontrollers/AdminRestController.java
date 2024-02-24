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
import wafa.finetude.formation.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminRestController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Admin getAdminById(@PathVariable("id") Long id) {
        return adminService.getAdmin(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAdmin(@PathVariable("id") Long id) {
        adminService.deleteAdmintById(id);
    }

    @RequestMapping(value = "/findByNom/{nom}", method = RequestMethod.GET)
    public List<Admin> getAdminByNom(@PathVariable("nom") String nom) {
        return adminService.findByUsername(nom);
    }

}
