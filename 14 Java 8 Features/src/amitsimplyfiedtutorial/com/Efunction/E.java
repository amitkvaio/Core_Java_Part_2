package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

public class E {
	public static void main(String[] args) {
		Function<Integer, Double> functionSqrt = n -> Math.sqrt(n);
		Function<Double, Double> functionDouble = n -> 2.0 * n;

		double result = functionSqrt.andThen(functionDouble).apply(30);
		System.out.println("Result with andThen: " + result);
	}
}

/*
andThen function

It is default function. 
andThen executes the caller first and the parameter last.

*/