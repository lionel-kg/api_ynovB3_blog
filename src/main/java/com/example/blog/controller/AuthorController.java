package com.example.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.configuration.JwtTokenUtil;
import com.example.blog.model.Author;
import com.example.blog.service.AuthorService;


@RestController
@RequestMapping("/blog-api")
public class AuthorController {

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private AuthorService authorService;

	@PostMapping("/login")
	public ResponseEntity<String> login(
			@RequestBody Author author) {

		try  {
			Authentication authenticate = 
					authenticationManager.authenticate(
							new UsernamePasswordAuthenticationToken(
									author.getUsername(),
									author.getPassword()
									)
							);
			User authenticatedUser = (User) authenticate.getPrincipal();
			String token = 
					jwtTokenUtil.generateAccessToken(authenticatedUser);
			System.out.println("Token is : " + token);

			String text = authenticatedUser.getUsername() 
					+ " successfully autenticated";
			ResponseEntity<String> response = 
					ResponseEntity.ok()
					.header(HttpHeaders.AUTHORIZATION, token)
					.body(text);
			return response;
		} catch (BadCredentialsException e) {
			return ResponseEntity.status(
					HttpStatus.UNAUTHORIZED).build();
		}
	}	
	
	@GetMapping("/author/{username}")
	public Author getAuthorByUsername(@PathVariable("username") String username) {
		return authorService.getUserByUsername(username);
	}

	@GetMapping("/securitynone")
	public String securityNone() {
		return "open";
	}
}