package com.java09;


abstract class Shape<T> {
	abstract void draw(T shape);
}

public class GDiamondOperator {
	public static void main(String[] args) {
		Shape<String> shape = new Shape<>() { // Diamond operator
			@Override
			void draw(String shape) {
				System.out.println("Drawing " + shape);
			}
		};
		shape.draw("Circle");
	}
}
/*
Java 9 allows using the diamond operator <> with anonymous classes, making the code simpler.
The diamond operator <> infers the type automatically.
Reduces redundant type declarations.
*/