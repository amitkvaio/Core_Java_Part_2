package com.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GnotPredicateMethod {
	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List<String> withoutBlanks = sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		System.out.println(withoutBlanks);
		
	}
}
/*

A static not method has been added to the Predicate interface. 
	We can use it to negate an existing predicate, much like the negate method:

*/


/*
Feature								Description
String.isBlank(), etc.				New string utilities
var in Lambdas						Use var in lambda parameters
Standard HttpClient					Modern HTTP requests
Files.readString()/writeString()	File I/O made easier
Collection toArray()				Functional array conversion
Removed Java EE Modules				Cleaner, modular JDK
*/