package com.infycodes.springboot_firstapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infycodes.springboot_firstapp.config.BookConfig;
import com.infycodes.springboot_firstapp.model.Book;

	
@RestController
public class Controller {
	
	@Autowired
	BookConfig bookConfig;

	
	@Value("${spring.application.name}")
	private String appname;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@GetMapping(value="/getProperty")
	public String getValue()
	{
		return url;
	}
	
	@GetMapping(value="/get-book")
	public ResponseEntity<Book> getbook()
	{
		Book book=new Book();
		book.setName(bookConfig.getName());
		book.setPublishedDate(bookConfig.getPublishedDate());
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
	
}
