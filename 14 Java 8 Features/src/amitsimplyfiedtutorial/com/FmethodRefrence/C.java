package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.function.Function;

//Constructor Reference
public class C {
	public static void main(String[] args) {
		Function<String, String> constructorRef = str -> new String(str);
		//Function<String, String> constructorRef = String::new;
		String sb = constructorRef.apply("Constructor Reference!");
		System.out.println(sb);
	}
}
