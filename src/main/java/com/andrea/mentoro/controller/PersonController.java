package com.andrea.mentoro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrea.mentoro.model.PersonDto;

@RestController
public class PersonController {

	@GetMapping ("/person")
	public List<PersonDto> getPeople() {
		//return null;
		List<PersonDto> list = new ArrayList<>();
		PersonDto person = new PersonDto();
		person.setName("Andrea");
		person.setPhoneNumber(123456789);
		person.setLikesCode(true);
		list.add(person);
		return list;
	}
}
