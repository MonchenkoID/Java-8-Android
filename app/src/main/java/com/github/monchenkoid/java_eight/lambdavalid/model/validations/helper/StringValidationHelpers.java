package com.github.monchenkoid.java_eight.lambdavalid.model.validations.helper;

import com.github.monchenkoid.java_eight.lambdavalid.model.validations.SimpleValidation;
import com.github.monchenkoid.java_eight.lambdavalid.model.validations.Validation;

import static java.lang.String.format;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

public class StringValidationHelpers {
	public static Validation<String> notNull = SimpleValidation.from((s) -> s != null, "must not be null.");
	
	public static Validation<String> moreThan(int size){
		return SimpleValidation.from((s) -> s.length() >= size, format("must have more than %s chars.", size));
	}
	
	public static Validation<String> lessThan(int size){
		return SimpleValidation.from((s) -> s.length() <= size, format("must have less than %s chars.", size));
	}
	
	public static Validation<String> between(int minSize, int maxSize){
		return moreThan(minSize).and(lessThan(maxSize));
	}
	
	public static Validation<String> contains(String c){
		return SimpleValidation.from((s) -> s.contains(c), format("must contain %s", c));
	}
}
