package com.infycodes.springboot_firstapp.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@Value("${spring.application.name}")
	private String appname;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@GetMapping(value="/getProperty")
	public String getValue()
	{
		return url;
	}

}
