package com.techietaught.springSecurityAuthenticationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BasicAuthWebSecurityConfigAdapter {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		return http.
				csrf().
				disable().
				authorizeHttpRequests().
				anyRequest().
				authenticated().
				and().
				formLogin().
				and().
				httpBasic().
				and().
				build();
	}
	
	@Bean
	public UserDetailsService userDetails() {
		UserDetails user = User.
				withDefaultPasswordEncoder().
				username("rabin").
				password("techietaught").
				roles("USER").
				build();
		return new InMemoryUserDetailsManager(user);
	}
}
