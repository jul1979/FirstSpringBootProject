    package he2b.g48982.web5g.annualprogram.security;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
    import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
    import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

    import javax.sql.DataSource;

    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private DataSource dataSource;




        @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
             auth.jdbcAuthentication()
             .dataSource(dataSource)  .usersByUsernameQuery(
                     "select username, password, enabled from user where username=?")
             .authoritiesByUsernameQuery(
                     "select username, authority" + " from authority where username=?");
             }


        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    //.antMatchers("/formulaire/**", "/addStory/**")
                    //.hasRole("ADMIN")
                    .antMatchers("/**", "/h2-console/**").permitAll()
                    .and()
                    .exceptionHandling()
                    .accessDeniedPage("/")
                    .and()
                    .formLogin()
            ;
            http.csrf().disable();
            http.headers().frameOptions().disable();
        }

    }