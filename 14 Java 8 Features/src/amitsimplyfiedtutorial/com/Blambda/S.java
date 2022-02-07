package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
interface R{
	public void test();
}
public class S {
	int x = 777;
	public void test2() {
		R r = () -> {
			int x = 888;
			System.out.println(x);
			System.out.println(this.x); 
		};
		r.test();
	}
	public static void main(String[] args) {
		S  s = new S();
		s.test2();
	}
}
/*
-- 	Inside lambda expression we can’t declare instance variables. 
--	Whatever the variables declare inside lambda expression are simply acts as local variables 
--	Within lambda expression ‘this” keyword represents current outer class object reference (that is 
--	current enclosing class reference in which we declare lambda expression)

*/