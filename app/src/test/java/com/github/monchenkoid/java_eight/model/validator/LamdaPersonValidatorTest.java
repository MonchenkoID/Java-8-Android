package com.github.monchenkoid.java_eight.model.validator;

public class LamdaPersonValidatorTest extends AbstractPersonValidationsTest {

	@Override
	protected PersonValidator getValidatorInstance() {
		return new LamdaPersonValidator();
	}

}
