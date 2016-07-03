package com.paulognr.util;

import java.util.Arrays;
import java.util.List;

import com.paulognr.model.Person;

public final class DataUtil {

	private DataUtil() {
		super();
	}

	public static List<Person> getAllPerson() {
		return Arrays.asList(new Person("Jon Snow"), new Person("Bran Stark"), new Person("Arya Stark"),
				new Person("Sansa Stark"));
	}
}
