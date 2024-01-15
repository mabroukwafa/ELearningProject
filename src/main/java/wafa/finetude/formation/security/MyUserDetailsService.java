/*package wafa.finetude.formation.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.User;
import wafa.finetude.formation.service.UserService;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserService userService;
	@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userService.findByUsername(username);
	
    if (user==null) 
    throw new UsernameNotFoundException("Utilisateur introuvable !");
	
	List<GrantedAuthority> auths = new ArrayList<>();

     if (user instanceof Admin) {
        auths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }
    if (user instanceof Employe) {
        auths.add(new SimpleGrantedAuthority("ROLE_EMPLOYE"));
    }
    if (user instanceof Formateur) {
        auths.add(new SimpleGrantedAuthority("ROLE_FORMATEUR"));
    }
	
	 /*user.getRoles().forEach(role -> {
		 GrantedAuthority auhority = new SimpleGrantedAuthority(role.getRole());
		 auths.add(auhority);
	 });*/
	
	/*return new org.springframework.security.core.
			userdetails.User(user.getUsername(),user.getPassword(),auths);
  }
    
}
*/