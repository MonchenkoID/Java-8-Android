package com.github.monchenkoid.java_eight.model.validator;

import com.github.monchenkoid.java_eight.model.Person;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public abstract class AbstractPersonValidationsTest {
	
	// children must provide a specific validator to be tested
	protected abstract com.github.monchenkoid.java_eight.model.validator.PersonValidator getValidatorInstance();

	@Test
	public void person_isComplete_validationSucceed() {
		getValidatorInstance().validate(
			new Person("bill", "clinton", "bill@gmail.com", 60)
		);
	}
	
	@Test
	public void person_withoutFirstName_validationFail() {
		try {
			getValidatorInstance().validate(
				new Person(null, "clinton", "bill@gmail.com", 60)
			);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("firstname"));
		}
	}
	
	@Test
	public void person_shortFirstName_validationFail() {
		try {
			getValidatorInstance().validate(
				new Person("b", "clinton", "bill@gmail.com", 60)
			);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("firstname"));
		}
	}
	
	@Test
	public void person_wrongEmail_validationFail() {
		try {
			getValidatorInstance().validate(
				new Person("bill", "clinton", "bill_gmail.com", 60)
			);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("email"));
		}
	}
	
	@Test
	public void person_didntBorn_validationFail() {
		try {
			getValidatorInstance().validate(
				new Person("bill", "clinton", "bill@gmail.com", -10)
			);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("age"));
		}
	}
	
	@Test
	public void person_isDeath_validationFail() {
		try {
			getValidatorInstance().validate(
				new Person("bill", "clinton", "bill@gmail.com", 100000)
			);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().contains("age"));
		}
	}
	
}
