package amitsimplyfiedtutorial.com.Alambda;

public class MyFunctionalInterfaceImp3 {
	public static void main(String args[]) {
		
		//lambda expression without using any parameter
		MyFunctionalInterface3 msg = (int num) -> num+5;  
		MyFunctionalInterface3 msg1 = ( num) -> num+25;  
		System.out.println(msg.incrementByFive(10));
		System.out.println(msg1.incrementByFive(10));
		
	}
}
