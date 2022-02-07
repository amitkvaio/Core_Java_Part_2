package amitsimplyfiedtutorial.com.Alambda;

public class MyFunctionalInterfaceImp2 {
	public static void main(String args[]) {
		 
		//lambda expression with using any parameter
		MyFunctionalInterface2 welCome = (wel) -> {
			return wel;
		};
		System.out.println(welCome.welComeHello("WECOME TO LAMDA EXPRESSION"));
	}
}
