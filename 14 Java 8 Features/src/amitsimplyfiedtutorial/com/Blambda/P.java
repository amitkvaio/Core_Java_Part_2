package amitsimplyfiedtutorial.com.Blambda;
// Using Runnable Interface with Lambda expression

public class P {
	public static void main(String[] args) {
		
		
		Runnable run = ()->{
			 for (int i = 0; i <= 5; i++) {
				System.out.println("from child thread");
			}
		 };
		 Thread th = new Thread(run);
		 th.start();
		
		 
		 
		 
		 
		 for (int i = 0; i <=10; i++) {
			System.out.println("Main thread");
		}
		 
		 
		 new Thread(()-> {
			 for (int i = 0; i < 20; i++) {
				 System.out.println("Anonymous child thread");
			}
		 }).start();
	}
}
