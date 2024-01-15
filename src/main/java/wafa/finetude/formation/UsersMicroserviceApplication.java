/*
 * package wafa.finetude.formation;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.boot.SpringApplication;
 * import org.springframework.boot.autoconfigure.SpringBootApplication;
 * import org.springframework.context.annotation.Bean;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import wafa.finetude.formation.service.UserService;
 * 
 * @SpringBootApplication
 * public class UsersMicroserviceApplication {
 * 
 * @Autowired
 * UserService userService;
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(UsersMicroserviceApplication.class, args);
 * }
 * 
 * /*
 * 
 * @PostConstruct
 * void init_users() {
 * 
 * userService.saveUser(new Admin("admin1", "admin1@gmail.com", "123"));
 * userService.saveUser(new Employe("Employe1", "Employe1@gmail.com", "1234"));
 * userService.saveUser(new Formateur("formateur1", "formateur@gmail.com",
 * "123"));
 * 
 * }
 */
/*
 * @Bean
 * BCryptPasswordEncoder getBCE() {
 * return new BCryptPasswordEncoder();
 * }
 * 
 * }
 */