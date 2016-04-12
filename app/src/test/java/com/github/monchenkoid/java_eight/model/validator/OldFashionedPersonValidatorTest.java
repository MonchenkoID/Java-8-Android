package com.github.monchenkoid.java_eight.model.validator;

public class OldFashionedPersonValidatorTest extends AbstractPersonValidationsTest {

	@Override
	protected PersonValidator getValidatorInstance() {
		return new OldFashionedPersonValidator();
	}

}
