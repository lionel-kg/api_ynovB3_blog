//package com.projet.blog.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService 
//{
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//		
//		User blogUser = new User(
//				"Admin",
//				new BCryptPasswordEncoder().encode("Admin1234"),
//				getGrantedAuthorities());
//		return blogUser;
//	}
//	
//	private List<GrantedAuthority> getGrantedAuthorities(){
//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		return authorities;
//	}
//	
//	
//}
