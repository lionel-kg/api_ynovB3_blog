package com.example.blog.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.blog.model.Author;
import com.example.blog.repository.AuthorRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		Author author = authorRepository.findByUsername(username);
		if(author == null) {
			throw new UsernameNotFoundException(username + " not found");
		}	
		User user = new User(
				author.getUsername(), 
				author.getPassword(), 
				getGrantedAuthorities());
		return user;
	}
	
	private List<GrantedAuthority> getGrantedAuthorities() {
		List<GrantedAuthority> authorities = 
				new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authorities;
	}
	   
}