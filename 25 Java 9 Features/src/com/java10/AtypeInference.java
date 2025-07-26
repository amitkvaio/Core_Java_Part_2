package com.java10;

public class AtypeInference {
	public static void main(String[] args) {
        var message = "Hello Java 10!";
        var number = 10;
        var list = java.util.List.of("A", "B", "C");

        System.out.println(message);
        System.out.println(number);
        System.out.println(list);
    }
}

/*
Java 10 introduced the var keyword to allow type inference for local variables.

var automatically infers the variable's type.
Improves readability and reduces boilerplate.
Only works for local variables, for-loops, and try-with-resources.


var name; // error: cannot use 'var' on variable without initialize
var emptyList = null; //error

*/