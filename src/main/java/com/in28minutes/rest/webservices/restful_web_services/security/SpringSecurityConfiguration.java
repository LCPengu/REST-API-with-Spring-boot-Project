package com.in28minutes.rest.webservices.restful_web_services.security;


import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//all requests should be authicated
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		//if a request is not authenticated, a web page is shown
		http.httpBasic(withDefaults());
		//CSRF -> POST, PUT
		http.csrf().disable();
		return http.build();
	}
}
