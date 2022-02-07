package amitsimplyfiedtutorial.com.FmethodRefrence;

public class FunctionInterfaceImp1 {
	public static void main(String[] args) {
		
		FunctionInterface1 fi = new FunctionInterface1() {
			@Override
			public void display() {
				System.out.println("Function Interface Using Annonimous Inner Class");
			}
		};
		fi.display();
		
		FunctionInterface1 interface1 = ()-> {
			System.out.println("Function Interface Using Lamda Expression");
		};
		interface1.display();
		System.out.println("************");
		
		FunctionInterfaceImp1 imp1 = new FunctionInterfaceImp1();
		FunctionInterface1 interface12 = imp1::instaceMethod;
		interface12.display();
	}
	
	public void instaceMethod(){
		System.out.println("Function Interface using Instance Method");
	}
}


