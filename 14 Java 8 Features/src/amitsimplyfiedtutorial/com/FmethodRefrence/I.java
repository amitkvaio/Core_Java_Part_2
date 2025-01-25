package amitsimplyfiedtutorial.com.FmethodRefrence;
@FunctionalInterface
interface Fun{
	public int test();
}

public class I {
	public static void main(String[] args) {
		Fun f = ()->{return 10;};
		System.out.println(f.test());
		System.out.println("***********************");
		
		I i = new I();
		Fun fun = i::test;
		System.out.println(fun.test());
	}
	
	public int test() {
		return 10;
	}
}
