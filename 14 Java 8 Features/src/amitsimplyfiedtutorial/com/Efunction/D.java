package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

//Function which takes in a number and returns square root of it
public class D {
	public static void main(String[] args) {
		Function<Integer, Double> sqFun = (num)->  Math.sqrt(num);
		System.out.println(sqFun.apply(9));
		System.out.println(sqFun.apply(49));
		System.out.println(sqFun.apply(26));
	}
}
