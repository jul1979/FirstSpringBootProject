package heb.esi.webg6cine48982.security;

//import javax.activation.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("bob")
                .password("{noop}bob")
                .authorities("CRITIC")
                .and()
                .withUser("alice")
                .password("{noop}alice")
                .authorities("CRITIC")
        ;
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()

                .authorizeRequests()
                //.antMatchers("/movies/**","/reviews/**").hasRole("CRITIC")
                .antMatchers("/login*","/h2-console/**","/api/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/",true)
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/login")
              ;
        http.headers().frameOptions().disable();
    }
//public class SecurityConfig  {

  /*  @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(
                        "select name, password, enabled from critic where name=?")

               .authoritiesByUsernameQuery(
                        "select name, authority" + " from authority where username=?");


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.antMatchers("/movies/**", "/detail/**", "/edit/**" ,"api/**")
               // .authenticated()

                .antMatchers( "/","/h2-console/**").permitAll()
                .and().formLogin()
        ;
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
    */

}
