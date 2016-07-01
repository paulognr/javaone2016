package com.paulognr.test.business;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.paulognr.business.PersonBO;
import com.paulognr.dao.PersonDAO;
import com.paulognr.model.Person;

@RunWith(value = MockitoJUnitRunner.class)
public class PersonBOTest {

	@Mock
	private PersonDAO personDAO;

	@InjectMocks
	private PersonBO personBO;

	@Test
	public void findAllEmpityTest() {
		when(personDAO.findAll()).thenReturn(new ArrayList<Person>());
		assertThat(personBO.findAll(), hasSize(0));
	}

	@Test
	public void findAllTest() {
		when(personDAO.findAll()).thenReturn(Arrays.asList(new Person()));
		assertThat(personBO.findAll(), hasSize(1));
	}
}
