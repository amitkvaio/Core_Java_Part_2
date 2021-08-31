package comb.equal.hashCode;
class L1 {
	int i;
}

class M1 {
	int i;

	public boolean equals(Object obj) {
		L1 myObj = (L1) obj;
		// L obj1=(L)obj;
		return i == myObj.i;
	}
}

public class Manager088 {
	public static void main(String[] args) {
		L1 obj1 = new L1();
		L1 obj2 = new L1();
		M1 obj3 = new M1();
		M1 obj4 = new M1();
		obj1.i = 10;
		obj2.i = 10;
		obj3.i = 10;
		obj4.i = 10;
		System.out.println(obj1.equals(obj2));
		System.out.println("............");
		System.out.println(obj3.equals(obj4));
		System.out.println("...........");
		System.out.println(obj1.equals(obj3));
		System.out.println("............");
		// System.out.println(obj3.equals(obj1));//CCE
	}
}


/*
 
 when ever calling m class equals method we need to supply m-type argument because we 
 are down casting into m-type if not supply then gives class type  
  
*/
