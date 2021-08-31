package comb.equal.hashCode;
class S {
	int i;
}

public class Manager11 {
	public static void main(String[] args) {
		S s1 = new S();
		S s2 = new S();
		s1.i = s2.i = 10;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
/*

Open Declaration int java.lang.Object.hashCode()

hashCode
public int hashCode()

it return the integer representation of memory address of the object.

*/