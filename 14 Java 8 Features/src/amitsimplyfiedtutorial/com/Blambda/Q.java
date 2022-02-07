package amitsimplyfiedtutorial.com.Blambda;
//Lambda expression with using  anonymous inner class 

public class Q {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("---Child Thread : ----");
			}
		});
		thread.start();
		for (int i = 0; i < 50 ; i++) {
			System.out.println("Main Thread --");
		}
	}
}


/*
--	Anonymous inner classes   vs Lambda Expressions 
--	Wherever we are using anonymous inner classes there may be a  chance of using Lambda expression 
--	to reduce length of the code and to resolve complexity. 

*/
