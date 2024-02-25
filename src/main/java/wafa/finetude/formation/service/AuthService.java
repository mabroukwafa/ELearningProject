package wafa.finetude.formation.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.User;
import wafa.finetude.formation.repos.UserRepository;

@Service
public class AuthService {
    
        @Autowired
        private UserRepository userRepository;
    
        public User authenticate(String username, String password) {
            User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
            return null;
        }
    }
    
    


