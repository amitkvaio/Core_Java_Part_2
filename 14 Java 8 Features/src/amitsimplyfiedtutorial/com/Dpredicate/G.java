package amitsimplyfiedtutorial.com.Dpredicate;
//We can pass Predicate as a function argument too.
public class G {
	public static void main(String[] args) {
		Predicate<Integer> p = (num)->num > 100;
		int y = 500 ;
		System.out.println(greaterCheck(p, y));
	}
	
	public static boolean greaterCheck(Predicate<Integer> p,int x) {
		return p.test(x);
	}
}
