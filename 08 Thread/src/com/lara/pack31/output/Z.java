package com.lara.pack31.output;

public class Z {
	public static void main(String[] args) {
		System.out.println("1 ");
		InnerClass i = new InnerClass();
		i.start();
		System.out.println("2 ");
	}

	static class InnerClass extends Thread {
		public void run() throws RuntimeException {
			throw new RuntimeException();
		}
	}
}

/*

Program will compile as run() method can throw RuntimeException. 
1 & 2 will be present in output and will throw java.lang.RuntimeException at runtime.

 
1
2
Exception in thread "Thread-0" java.lang.RuntimeException
	at com.lara.pack31.output.Z$InnerClass.run(Z.java:13)
*/
