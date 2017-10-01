package com.preetham.spring.boot.SpringBootApplicaion;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class BookController {

	@GetMapping("/books")
	public List<Book> getAllbooks(){
		
		return Arrays.asList(new Book(1,"ABC","XYZ"));
	}
	
	
	@GetMapping("/temp")
	public String getString(){
		
		return "hello world";
	}
}
