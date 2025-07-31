package com.andrea.mentoro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrea.mentoro.model.PersonDto;
import com.andrea.mentoro.service.PersonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PersonController {

	private PersonService personService;
	private static final String TAG_NAME = "Person";
	private static final String TAG_DESC = "The Person API";
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@Tag(name = TAG_NAME, description = TAG_DESC)
	@Operation(summary = "Get All People", description = "fetches all people from the database")
	@GetMapping("/person")
	public List<PersonDto> getPeople() {
		//return null;
		return personService.findAll();
	} 
	
	@Tag(name = TAG_NAME, description = TAG_DESC)
	@Operation(summary = "Get One Person", description = "Use the person ID to get One person")
	@GetMapping("/person/{id}")
	public PersonDto getPerson(@PathVariable Long id) {
		return personService.findOne(id);
		
	}
	
	@Tag(name = TAG_NAME, description = TAG_DESC)
	@Operation(summary = "Save a Person", description = "Create or Update an existing person")
	@PostMapping("/person")
	public PersonDto save(PersonDto personDto) {
		return personService.save(personDto); 
	
	}
	
	@Tag(name = TAG_NAME, description = TAG_DESC)
	@Operation(summary = "Delete a Person", description = "Delete a person by ID")
    @DeleteMapping("/person")
    public void delete(Long id) {
    	personService.delete(id);
    }
}