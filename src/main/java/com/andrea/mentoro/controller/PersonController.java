package com.andrea.mentoro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrea.mentoro.model.PersonDto;
import com.andrea.mentoro.service.PersonService;

@RestController
public class PersonController {

	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/person")
	public List<PersonDto> getPeople() {
		//return null;
		return personService.findAll();
	}
	
	@PostMapping("/person")
	public PersonDto save(PersonDto personDto) {
		return personService.save(personDto);
		
		
	}
}
