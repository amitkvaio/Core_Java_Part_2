package amitsimplyfiedtutorial.com.FmethodRefrence;

public class G {
	public static void main(String[] args) {
		
		F fi = new F() {
			@Override
			public void display() {
				System.out.println("Function Interface Using Annonimous Inner Class");
			}
		};
		fi.display();
		
		F interface1 = ()-> {
			System.out.println("Function Interface Using Lamda Expression");
		};
		interface1.display();
		System.out.println("************");
		
		G imp1 = new G();
		F interface12 = imp1::displayMethod;
		interface12.display();
	}
	
	public void displayMethod(){
		System.out.println("Function Interface using Instance Method>>>");
	}
}


