package aic;

public class Manager2 {
	public static void main(String[] args) {
		/*
			Here we are creating the object of subclass of class A,
			this subclass does not having any name.
			and we are overriding the test1 method.
			and subclass object reference is hold by its parent class.
			that is a1.
		
		*/
		A a1 = new A() {
			@Override
			void test1() {
				// super.test1();
				System.out.println("test1()-AIC");
			}
		};
		a1.test1();
		a1.test2();

		System.out.println("'''''''''''''''''");

		A a2 = new A() {

		};
		a2.test1();
		a2.test2();

	}
}
