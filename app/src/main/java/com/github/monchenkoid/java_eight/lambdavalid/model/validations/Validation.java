package com.github.monchenkoid.java_eight.lambdavalid.model.validations;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

@FunctionalInterface
public interface Validation<K> {

	ValidationResult test(K param);

	default Validation<K> and(Validation<K> other) {
		return (param) -> {
			ValidationResult firstResult = this.test(param);
			return !firstResult.isvalid() ? firstResult : other.test(param);
		};
	}

	default Validation<K> or(Validation<K> other) {
		return (param) -> {
			ValidationResult firstResult = this.test(param);
			return firstResult.isvalid() ? firstResult : other.test(param);
		};
	}

}
