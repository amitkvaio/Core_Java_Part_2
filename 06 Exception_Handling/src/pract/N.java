package pract;
public class N {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException ae) {
			}
		}
	}
}
