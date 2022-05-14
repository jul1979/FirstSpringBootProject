package g48982.webg5.pae.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();

        auth.jdbcAuthentication()
                        .dataSource(dataSource)
                                .withDefaultSchema()
                .passwordEncoder(pwdEncoder)
                .withUser("etu")
                .password(pwdEncoder.encode("etudiant"))
                .authorities("ROLE_ETU")
                .and()
                .passwordEncoder(pwdEncoder)
                .withUser("prof")
                .password(pwdEncoder.encode("professeur"))
                .authorities("ROLE_PROF")
                .and()
                .passwordEncoder(pwdEncoder)
                .withUser("sec")
                .password(pwdEncoder.encode("secretaire"))
                .authorities("ROLE_SEC");

        /*auth
                .inMemoryAuthentication()
                .withUser("etu")
                .password("{noop}etudiant")
                .authorities("ROLE_ETU")
                .and()
                .withUser("prof")
                .password("{noop}professeur")
                .authorities("ROLE_PROF")
                .and()
                .withUser("sec")
                .password("{noop}secretaire")
                .authorities("ROLE_SEC");*/

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/addCourse/**", "/addStudent/**")
                .hasRole("SEC")
                .antMatchers( "/","/h2-console/**").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/")
                .and()
                .logout()
                .logoutSuccessUrl("/");
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
