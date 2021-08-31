package pract;
public class O {
	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
				int a = 20;
				int b = 0;
				int c = a / b;
				System.out.println(c);
			}
		} catch (ArithmeticException ae) {
		}
	}
}

//output
//1