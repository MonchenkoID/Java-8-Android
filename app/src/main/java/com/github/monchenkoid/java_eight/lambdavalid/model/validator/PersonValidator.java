package com.github.monchenkoid.java_eight.model.validator;

import com.github.monchenkoid.java_eight.model.Person;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

public interface PersonValidator {

	void validate(Person person);
	
}
