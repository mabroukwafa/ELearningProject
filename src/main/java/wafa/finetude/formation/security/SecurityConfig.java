package wafa.finetude.formation.security;

/*  import org.springframework.context.annotation.Bean;
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * import org.springframework.security.web.SecurityFilterChain;
 * 
 * @EnableWebSecurity
 * public class SecurityConfig {
 * 
 * @Bean
 * public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
 * http.authorizeRequests()
 * .antMatchers("/admin/**").hasRole("ADMIN")
 * .antMatchers("/user/**").hasRole("USER")
 * .anyRequest().authenticated()
 * .and()
 * .httpBasic()
 * .and()
 * .formLogin()
 * .and()
 * .csrf().disable(); // Enable CSRF protection as needed
 * 
 * return http.build();
 * }
 * }
 
 * package wafa.finetude.formation.security;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.context.annotation.Bean;
 * import org.springframework.context.annotation.Configuration;
 * import org.springframework.security.authentication.AuthenticationManager;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder;
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.security.web.SecurityFilterChain;
 * import org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * @Configuration
 * // @EnableWebSecurity
 * public class SecurityConfig {
 * 
 * // @Autowired
 * // UserDetailsService userDetailsService;
 * 
 * @Autowired
 * BCryptPasswordEncoder bCryptPasswordEncoder;
 * 
 * // @Autowired
 * // AuthenticationManager authMgr;// va permettre au utilisateyur de se
 * connecter
 * 
 * @Bean
 * public AuthenticationManager authManager(HttpSecurity http,
 * BCryptPasswordEncoder bCryptPasswordEncoder,
 * UserDetailsService userDetailsService)
 * throws Exception {
 * return http.getSharedObject(AuthenticationManagerBuilder.class)
 * .userDetailsService(userDetailsService)
 * .passwordEncoder(bCryptPasswordEncoder)
 * .and()
 * .build();
 * }
 * }
 * /*
 * 
 * @Bean
 * public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
 * 
 * http.csrf((csrf) -> csrf.disable())
 * .sessionManagement(session ->
 * session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
 * .authorizeHttpRequests((requests)->requests
 * .requestMatchers("/login").permitAll()
 * .anyRequest().authenticated() )
 * .addFilterBefore(new JWTAuthenticationFilter
 * (authMgr),UsernamePasswordAuthenticationFilter.class);
 * 
 * return http.build();
 * 
 * }
 * }
 */
/* 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Désactiver CSRF pour le test
                .authorizeRequests()
                .antMatchers("/**").permitAll() // Permettre l'accès à tous les endpoints
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/