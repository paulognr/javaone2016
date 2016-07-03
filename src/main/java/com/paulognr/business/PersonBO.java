package com.paulognr.business;

import java.util.List;

import com.paulognr.constant.SystemConstants;
import com.paulognr.dao.PersonDAO;
import com.paulognr.model.Person;

/**
 * Business class
 * 
 * @author Paulo
 */
public class PersonBO {

	private PersonDAO personDAO;

	private String javaSdk;

	public PersonBO() {
		personDAO = new PersonDAO();
		javaSdk = System.getProperty(SystemConstants.JAVA_SDK);
	}

	public List<Person> findAll() {
		return personDAO.findAll();
	}

	public Person findByName(final String name) {
		if (SystemConstants.JAVA_8.equals(javaSdk)) {

		} else {
			for (Person person : personDAO.findAll()) {
				if (person.getName().equals(name)) {
					return person;
				}
			}
		}

		return null;
	}
}
