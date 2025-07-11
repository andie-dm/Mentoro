package com.andrea.mentoro.repo;

import org.springframework.data.repository.CrudRepository;

import com.andrea.mentoro.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
