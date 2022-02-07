package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
interface Test1 {
	//public void test1();
	//public void test1();
	public abstract long power(long num);
}
public class Test1122 {
	public static void main(String[] args) {
		 Thread th  = new Thread(
				 ()->{
					 for (int i = 0; i < 100; i++) {
							System.out.println("***********>"+Thread.currentThread().getName() + "i : " +i);
						}
					 }
				 );
		 th.start();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for (int i = 0; i < 100; i++) {
			System.out.println("***********>"+Thread.currentThread().getName() + "i : " +i);
		}
	}
}
