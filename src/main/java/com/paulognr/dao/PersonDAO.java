package com.paulognr.dao;

import java.util.Collections;
import java.util.List;

import com.paulognr.model.Person;

/**
 * Just a "fake" dao
 * 
 * @author Paulo
 */
public class PersonDAO {

	public Person create(Person person) {
		return person;
	}

	public Person update(Person person) {
		return person;
	}

	public void delete(Person person) {

	}

	public List<Person> findAll() {
		return Collections.emptyList();
	}
}
