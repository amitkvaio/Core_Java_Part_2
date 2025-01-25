package amitsimplyfiedtutorial.com.FmethodRefrence;

@FunctionalInterface
interface Add {
    int add(int a, int b);
}

public class H{
	public static void main(String[] args) {
		 // Using Lambda Expression
		Add add = (a, b) -> a + b;
        System.out.println("Addition using Lambda: " + add.add(5, 3));
        System.out.println("********************************************");
        
        // Using Instance Method Reference
        H addition = new H();
        Add add1 = (a, b) -> addition.instanceAdd(a, b);
        //Add add1 = addition::instanceAdd;
        System.out.println("Addition using Instance Method Reference: " + add1.add(5, 3));
	
	}
	
	// Instance method for addition
    public int instanceAdd(int a, int b) {
        return a + b;
    }
}

