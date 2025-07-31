package com.andrea.mentoro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	public PersonDto findOne(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return personTransformer.toDto(person.get());
	}

	public void delete(Long id) {
		personRepository.deleteById(id);
	}

}
