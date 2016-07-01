package com.paulognr.business;

import java.util.List;

import com.paulognr.dao.PersonDAO;
import com.paulognr.model.Person;

/**
 * 
 * Just a business class
 * 
 * @author Paulo
 */
public class PersonBO {

	private PersonDAO personDAO;

	public PersonBO() {
		personDAO = new PersonDAO();
	}

	public List<Person> findAll() {
		return personDAO.findAll();
	}
}
