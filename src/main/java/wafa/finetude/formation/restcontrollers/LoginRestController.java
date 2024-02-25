package wafa.finetude.formation.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.User;
import wafa.finetude.formation.service.AuthService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginRestController {

    @Autowired
    private AuthService authService;

    @PostMapping()
    public ResponseEntity<?> login(@RequestBody User loginRequest) {
        User user = authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

      if (user != null) {
        Map<String, Object> response = new HashMap<>();
        response.put("user", user);
        if (user instanceof Formateur) {
            response.put("role", "Formateur"); 
        } else if (user instanceof Admin) {
            response.put("role", "Admin"); 
        }  else if(user instanceof Employe) {
            response.put("role", "Employe"); 
        } 
        return ResponseEntity.ok().body(response);
    } else {
        return ResponseEntity.status(401).body("Échec de la connexion");
    }
}
    }


