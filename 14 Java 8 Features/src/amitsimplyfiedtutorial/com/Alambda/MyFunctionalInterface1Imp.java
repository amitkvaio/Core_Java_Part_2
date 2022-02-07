package amitsimplyfiedtutorial.com.Alambda;

public class MyFunctionalInterface1Imp {
	public static void main(String args[]) {
		//lambda expression without using any parameter
		
		MyFunctionalInterface1 msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
		System.out.println("done");
	}
}
/*
() ->{

}
*/