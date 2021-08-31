package coma.tostring;

class N {
}

public class Manager11 {
	public static void main(String[] args) {
		N n1 = null;
		System.out.println(n1);
		String s1 = n1 + "abc";
		System.out.println(s1);
		System.out.println("done");
	}
}
/*
if the reference is null then it is not calling the toString() internally it is checking n1 is null? then it
will print the null.
if it is not null then it will calling toString()

*/