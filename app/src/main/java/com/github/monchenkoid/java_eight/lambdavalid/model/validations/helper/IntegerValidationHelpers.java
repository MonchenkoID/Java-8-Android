package com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper;

import com.github.monchenkoid.java_eight.lambdavalid.model.validations.SimpleValidation;
import com.github.monchenkoid.java_eight.lambdavalid.model.validations.Validation;

import static java.lang.String.format;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

public class IntegerValidationHelpers {
	
	public static Validation<Integer> lowerThan(int max){
		return SimpleValidation.from((i) -> i < max, format("must be lower than %s.", max));
	}
	
	public static Validation<Integer> greaterThan(int min){
		return SimpleValidation.from((i) -> i > min, format("must be greater than %s.", min));
	}
	
	public static Validation<Integer> intBetween(int min, int max){
		return greaterThan(min).and(lowerThan(max));
	}
	
}
