
public class AccentureA {
	public static void main(String[] args) {
		String str = "kumar";
		if(str.startsWith("")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}

/*
It is true:

("" + "My String") obviously starts with "".

That's the same as saying "My String" starts with ""
Since every string in Java is considered to start with an empty string 
	(i.e., an empty string is a valid prefix for any string), 
	the condition if("AMIT".startsWith("")) evaluates to true.
*/