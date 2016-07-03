package com.paulognr.test.business;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.paulognr.business.PersonBO;
import com.paulognr.constant.SystemConstants;
import com.paulognr.dao.PersonDAO;
import com.paulognr.model.Person;
import com.paulognr.util.DataUtil;

@RunWith(value = MockitoJUnitRunner.class)
public class PersonBOTest {

	@Mock
	private PersonDAO personDAO;

	@InjectMocks
	private PersonBO personBO;

	@BeforeClass
	public static void setup() {
		System.setProperty(SystemConstants.JAVA_SDK, SystemConstants.JAVA_7);
		// System.setProperty(SystemConstante.JAVA_SDK, SystemConstante.JAVA_8);
	}

	@Test
	public void findAllEmptyTest() {
		when(personDAO.findAll()).thenReturn(new ArrayList<Person>());
		assertThat(personBO.findAll(), hasSize(0));
	}

	@Test
	public void findAllTest() {
		when(personDAO.findAll()).thenReturn(DataUtil.getAllPerson());
		assertThat(personBO.findAll(), hasSize(4));
	}

	@Test
	public void findByNameEmptyTest() {
		when(personDAO.findAll()).thenReturn(DataUtil.getAllPerson());
		assertThat(personBO.findByName("Goku"), nullValue());
	}

	@Test
	public void findByNameTest() {
		when(personDAO.findAll()).thenReturn(DataUtil.getAllPerson());
		assertThat(personBO.findByName("Jon Snow").getName(), equalTo("Jon Snow"));
	}
}
