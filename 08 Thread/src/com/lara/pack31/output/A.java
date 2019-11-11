package com.lara.pack31.output;

public class A implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}

	public static void main(String... args) {
		A runnable = new A();
		System.out.println("start main() method");
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
		System.out.println("end main() method");
	}
}

/*

Thread behavior is unpredictable because execution of Threads depends on Thread scheduler,
start main() method will be the printed first, but after that we cannot guarantee the order 
of thread1, thread2 and main thread they might run simultaneously or sequentially, 
so order of end main() method will not be guaranteed.
 

start main() method
end main() method
i=0 ,ThreadName=Thread-0
i=0 ,ThreadName=Thread-1
i=1 ,ThreadName=Thread-0
i=2 ,ThreadName=Thread-0
i=1 ,ThreadName=Thread-1
i=2 ,ThreadName=Thread-1
 
*/