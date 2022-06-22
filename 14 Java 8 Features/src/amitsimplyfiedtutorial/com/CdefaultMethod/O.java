package amitsimplyfiedtutorial.com.CdefaultMethod;

class N{
	private static void privateTest() {
		System.out.println("From N - private Test()");
	}
}
public class O extends N {
	public  void privateTest() {
		System.out.println("From O - private Test()");
	}
	//This’s valid but not overriding
	
	public static void main(String[] args) {
		O o = new O();
		o.privateTest();
	}
}
