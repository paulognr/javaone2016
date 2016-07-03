package com.paulognr.dao;

import java.util.List;

import com.paulognr.model.Person;
import com.paulognr.util.DataUtil;

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
		return DataUtil.getAllPerson();
	}
}
