package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.function.Function;

//Instance method
public class B {
	
	public String instanceMethod(String input) {
		return "Instance Method: " + input;
	}
	
	public static void main(String[] args) {
        B b = new B();
        Function<String, String> instanceRef = input -> b.instanceMethod(input);
        //Function<String, String> instanceRef = b::instanceMethod;
        System.out.println(instanceRef.apply("World"));
	}
}
