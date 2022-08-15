package com.techietaught.matchStrategy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchStrategyController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("hello");
	}
	
	@GetMapping("/hello/a?thor")
	public ResponseEntity<String> sayAuthor(){
		return ResponseEntity.ok("hello Author");
	}
	
	@GetMapping("/hello/a*thor")
	public ResponseEntity<String> sayAuthorWithMultipleChars(){
		return ResponseEntity.ok("hello AuthorWithMultipleChars");
	}
	
	@GetMapping("/hello/**")
	public ResponseEntity<String> sayHelloWithAnyPath(){
		return ResponseEntity.ok("hello WithAnyPath in the req url");
	}
	
	@GetMapping("/resources/{*path}")
	public ResponseEntity<String> sayHelloWithAnything(){
		return ResponseEntity.ok("hello WithAnything in the req url");
	}
	
	@GetMapping("/hello/{path:[a-z]+}")
	public ResponseEntity<String> sayHelloWithAnyCharBetweenA2Z(){
		return ResponseEntity.ok("hello WithAnyCharBetweenA2Z");
	}
	
	// this url pattern only supported by ant-path-matcher
	//@GetMapping("/org/**/*.jsp")
	//public ResponseEntity<String> sayHelloWithAnyPathTest(){
	//	return ResponseEntity.ok("hello WithAnyPath in the req url test...");
	//}
}
