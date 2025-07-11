package com.andrea.mentoro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrea.mentoro.model.Person;
import com.andrea.mentoro.model.PersonDto;
import com.andrea.mentoro.repo.PersonRepository;
import com.andrea.mentoro.transform.PersonTransformer;

@Service
public class PersonService {
	
	private PersonRepository personRepository;
	private PersonTransformer personTransformer;
	
	@Autowired
	public PersonService(PersonRepository personRepository, PersonTransformer personTransformer) {
		this.personRepository = personRepository;
		this.personTransformer = personTransformer;
	}
	
	public PersonDto save(PersonDto personDto) {
		Person person = personTransformer.toEntity(personDto);
	    person = personRepository.save(person);
	    personDto = personTransformer.toDto(person);
		return personDto;
	}

	public List<PersonDto> findAll() {
		Iterable<Person> results = personRepository.findAll();
		return personTransformer.toDto(results);
	}

}
