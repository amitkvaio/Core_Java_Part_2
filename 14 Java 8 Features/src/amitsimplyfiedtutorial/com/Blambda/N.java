package amitsimplyfiedtutorial.com.Blambda;

@FunctionalInterface
interface Sum{
	public abstract int sum(int first, int second);
}

/*public class N implements Sum {
	@Override
	public static void main(String[] args) {
		Sum sum = new N();
		System.out.println(sum.sum(10, 20));
	public int sum(int first, int second) {
		return first+second;
	}
	}
}*/

//Using lambda expression - Here no need to implements the respective interface.
public class N {
	public static void main(String[] args) {
		 Sum sum  = (a,b) -> {return a+b;};
		 System.out.println("Sum of the given two number is : "+sum.sum(20, 60));
		 Sum sum1= (a,b)->{return a+b;};
		 
		 System.out.println("Sum of the given two number is : "+sum1.sum(200, 600));
	}
}
