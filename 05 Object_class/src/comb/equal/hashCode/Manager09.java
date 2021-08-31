package comb.equal.hashCode;
class P {
	int i;
}

class Q {
	int i;

	public boolean equals(Object obj) {
		if (!(obj instanceof Q)) {
			return false;
		}
		Q myobj = (Q) obj;
		return i == myobj.i;
	}
}

public class Manager09 {
	public static void main(String[] args) {
		P p1 = new P();
		P p2 = new P();
		Q q1 = new Q();
		Q q2 = new Q();
		p1.i = 10;
		q1.i = 10;
		q2.i = 10;
		System.out.println(p1.equals(p2));// false
		System.out.println(q1.equals(q2));// true
		System.out.println(p1.equals(q2));// false, calling equals() of object class
		System.out.println(q1.equals(p1));// false, p1 is not Q type so it retrun flase
	}
}
/*
p1 and p2 both are of P class type and in this class there is no equals method is override so it will call
the equals method  of object class since p1 and p2 both are pointing to different object that is why it returns false


System.out.println(q1.equals(p1));

through q1 we are calling equals method  of Q class , inside Q class equals method is override, equals method 
argument require q type but here we are passing p type , inside equals method of Q class there is if block 
and it checking passing argument is either q type or not if it is q type then control will not comes inside the 
if block body, given argument is down casted into Q type,
other then Q type it return false


"instanceof"  it checking passing argument is Q type or not.


*/