package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

public class I {
	public static void main(String[] args) {
		Function<String, String> fun = Function.identity();
		String str = fun.apply("Bangalore");
		System.out.println("Str : "+str);
	}
}
