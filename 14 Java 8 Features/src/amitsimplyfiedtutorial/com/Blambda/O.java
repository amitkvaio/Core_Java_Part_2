package amitsimplyfiedtutorial.com.Blambda;
//Square of the given number using lambda expression
@FunctionalInterface
interface Power{
	public abstract long power(long num);
}
public class O {
	public static void main(String[] args) {
		Power  power = (p) -> {return p*p ;};
		System.out.println("Square of the given numbr is : " +power.power(12));
	}
}
