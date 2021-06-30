package com.ashish.java8.optional;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Optional<String> checkOptional = Optional.of("Ashish");
		System.out.println(checkOptional.get());

		Optional emptyOptional = Optional.empty();
		Optional alsoEmpty = Optional.ofNullable(null);
		Optional<String> checkOptional_1 = Optional.of("");
		System.out.println(emptyOptional.isPresent());
		System.out.println(checkOptional.isPresent());
		System.out.println(checkOptional_1.isPresent());
		System.out.println(alsoEmpty.isPresent());
		System.out.println(emptyOptional.orElse("B"));


	}
}
