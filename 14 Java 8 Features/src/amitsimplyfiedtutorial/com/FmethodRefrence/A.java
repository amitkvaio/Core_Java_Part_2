package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.function.Function;


//Example of Static method reference
public class A {
	public static void main(String[] args) {
		Function<String, String> fun = str -> test(str);
		//Function<String, String> fun = A::test;
		System.out.println(fun.apply("Hello"));
	}

	public static String test(String str) {
		return str;
	}
}
/*

Method references allow us to refer to a method without invoking it.
It can be used in the place of lamda expression when the lambda expression only call an existing method.

Types of Method References

Static Method Reference (ClassName::staticMethod)
Instance Method Reference (instance::instanceMethod)
Constructor Reference (ClassName::new)




*/