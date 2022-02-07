package amitsimplyfiedtutorial.com.FmethodRefrence;
@FunctionalInterface
interface Fun{
	public int test();
}

public class Test {
	public static void main(String[] args) {
		Fun f = ()->{return 10;};
		Fun ff=f::test;
		System.out.println(f.test());
		System.out.println(ff.test());
	}
	
	public int test() {
		return 10;
	}
}
