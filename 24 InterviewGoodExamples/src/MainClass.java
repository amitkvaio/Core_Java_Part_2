abstract class A {
	abstract void firstMethod();

	void secondMethod() {
		System.out.println("SECOND");

		firstMethod();
	}
}

abstract class B extends A {
	@Override
	void firstMethod() {
		System.out.println("FIRST");

		thirdMethod();
	}

	abstract void thirdMethod();
}

class C extends B {
	@Override
	void thirdMethod() {
		System.out.println("THIRD");
	}
}

public class MainClass {
	public static void main(String[] args) {
		C c = new C();

		c.firstMethod();
		System.out.println("***********");
		c.secondMethod();
		System.out.println("************");
		c.thirdMethod();
	}
}
//--------------------------------
class Azz
{
    void methodOfA()
    {
        abstract class B
        {
             
        }
    }
}