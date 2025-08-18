package com.andrea.mentoro.transform;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.andrea.mentoro.model.Person;
import com.andrea.mentoro.model.PersonDto;

@Component
public class PersonTransformer {
	
	public Person toEntity(PersonDto personDto) { 
		Person person = new Person();
		person.setId(personDto.getId()); 
		person.setName(personDto.getName());
		person.setPhoneNumber(phoneNumberToLong(personDto.getPhoneNumber()));
		person.setLikesCode(personDto.getLikesCode());
		return person;
	}

	public PersonDto toDto(Person person) {
		PersonDto personDto = new PersonDto();
		personDto.setId(person.getId());
		personDto.setName(person.getName());
		personDto.setPhoneNumber(phoneNumberToString(person.getPhoneNumber()));
		personDto.setLikesCode(person.getLikesCode());
		return personDto;
	}

	public List<PersonDto> toDto(Iterable<Person> results) {
		List<PersonDto> dtos = new ArrayList<>();
		results.forEach(result -> dtos.add(toDto(result)));
		return dtos;
	}

//	this line is to convert the strings to integer on the phone numbers
	protected Long phoneNumberToLong(String phoneNumber) {
		phoneNumber = phoneNumber.replace("(", "");
		phoneNumber = phoneNumber.replace(")", "");
		phoneNumber = phoneNumber.replace(" ", "");
		phoneNumber = phoneNumber.replace("-", "");
		phoneNumber = phoneNumber.replace(".", "");
		Long number = Long.valueOf(phoneNumber);
		return number;
		
	}
	
	protected String phoneNumberToString(Long phoneNumber) {
		String input = String.valueOf(phoneNumber);
		String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");   //(123) 456-7890		
		return number;
	}
	
}
	
