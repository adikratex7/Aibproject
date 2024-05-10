package com.aditya.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//Here InMemoryDB
		
		
		auth.inMemoryAuthentication().withUser("Aditya").password("{noop}Spark").roles("Employee");
		auth.inMemoryAuthentication().withUser("Manish").password("{noop}Manish").roles("MANAGER");
	//	auth.inMemoryAuthentication().withUser("Nisha).password("{noop}Nisha").roles("ADMIN");
		
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests().antMatchers("/").permitAll() 
		.antMatchers("/addhighlights").authenticated()   
		.antMatchers("/showhighlights").hasAuthority("MANAGER") 
		.anyRequest().authenticated().and().formLogin().and().exceptionHandling().accessDeniedPage("/denied")
		
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and().rememberMe();
		
		
		
	
	}
}
