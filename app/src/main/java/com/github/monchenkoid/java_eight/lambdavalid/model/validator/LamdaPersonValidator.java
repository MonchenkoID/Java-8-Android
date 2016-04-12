package com.github.monchenkoid.java_eight.model.validator;

import com.github.monchenkoid.java_eight.model.Person;

import static com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper.IntegerValidationHelpers.intBetween;
import static com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper.StringValidationHelpers.between;
import static com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper.StringValidationHelpers.contains;
import static com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper.StringValidationHelpers.notNull;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

public class LamdaPersonValidator implements PersonValidator {

	public void validate(Person person) {
		notNull.and(between(2, 12)).test(person.getFirstName()).throwIfInvalid("firstname");
		notNull.and(between(4, 30)).test(person.getLastName()).throwIfInvalid("secondname");
		notNull.and(between(3, 50)).and(contains("@")).test(person.getEmail()).throwIfInvalid("email");
		intBetween(0, 110).test(person.getAge()).throwIfInvalid("age");
	}
	
}
