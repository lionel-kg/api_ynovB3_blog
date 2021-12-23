/*package com.example.blog.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//import com.projet.blog.service.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{
	
//	@Autowired
//	private CustomUserDetailsService userdetailsService;

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
//	@Autowired
//	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
//		this.passwordEncoder = passwordEncoder;
//	}
//	
//	public PasswordEncoder getPasswordEncoder() {
//		return passwordEncoder;
//	}
	
	

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http 	
				.csrf().disable()
				
				.authorizeRequests()
					.antMatchers("/", "index", "/css/*" , "/js/*").permitAll()
					.antMatchers("/login").permitAll()
					.antMatchers("/private").hasRole("Admin")
				
//				.antMatchers("/api/**").hasRole(ADMIN.name())
				
					.anyRequest().authenticated()
					.and()
				
//				.httpBasic();
				.formLogin()
					.loginPage("/login").permitAll()
					.defaultSuccessUrl("/courses", true)
					.and()
					.rememberMe().tokenValiditySeconds(6000).key("securitiesInfos")
					.and()
				.logout()
					.logoutUrl("/logout")
					.clearAuthentication(true)
					.invalidateHttpSession(true)
					.deleteCookies("JSESSIONID", "remember-me")
					.logoutSuccessUrl("/login");
	}

//@Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//	auth.userDetailsService(userDetailsService())
//		.passwordEncoder(passwordEncoder());
//}
//	@Bean
//	protected UserDetailsService userdetailsService() {
//		UserDetails firstAdmin = User.builder()
//			.username("Admin")
//			.password(passwordEncoder.encode("password"))
////			.roles(ApplicationUserRole.ADMIN.name())
//			.roles("ADMIN")
//			.build();
//		
//		return InMemoryUserDetailsManager(
//				firstAdmin
//				);
//	}
//
//	private UserDetailsService InMemoryUserDetailsManager(UserDetails firstAdmin) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//public CustomUserDetailsService getUserdetailsService() {
//	return userdetailsService;
//}
//
//public void setUserdetailsService(CustomUserDetailsService userdetailsService) {
//	this.userdetailsService = userdetailsService;
//}
}*/
