interface Syn{
	public void test1();
	//public synchronized void test4();
	/*
		 Interface methods cannot have declare abstract methods as synchronized concrete 
		 class which implements interface can make methods synchronized.

	*/
}

abstract class AbsSyn{
	abstract void test2();
	
	public synchronized void test3() {
		System.out.println("AbsSyn abstract class - in Synchronized test3()");
	}
}

public class Binterface extends AbsSyn implements Syn  {
	@Override
	public synchronized void test1() {
		System.out.println("Override sysnchronized test1 method ");
	}
	
	public static void main(String[] args) {
		Binterface b=new Binterface();
		b.test1();
		b.test2();
		b.test3();
	}

	@Override
	synchronized void test2() {
		System.out.println("Override sysnchronized test2 method of AbsSyn class");
	}
	
	@Override
	public synchronized void test3() {
		System.out.println("Override sysnchronized test3 method of AbsSyn class");
	}
}
