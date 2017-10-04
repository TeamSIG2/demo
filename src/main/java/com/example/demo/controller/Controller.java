package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value="/welcome", method= RequestMethod.POST, produces = "application/json")
	public Map<String, Object> welcome(){
		Map<String, Object> response = new HashMap<String, Object>();
		
		response.put("mensnaje", "Consulta exitosa!!");
		
		return response; 
		
		
	}
	
}
