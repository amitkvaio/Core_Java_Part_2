package com.tricky01;

public class Test {
	public static volatile int count = 1;

	public static void main(String[] args) {
		Runnable run = () -> {
			String thName = Thread.currentThread().getName();
			while (count < 40) {
				synchronized (Integer.class) {
					if (count % 2 == 0 && "Even".equals(thName)) {
						System.out.println(thName + ":" + count);
						count++;
					} else if (count % 2 == 1 && "Odd".equals(thName)) {
						System.out.println(thName + ":" + count);
						count++;
					}
				}
			}
		};
		Thread t1 = new Thread(run, "Even");
		Thread t2 = new Thread(run, "Odd");
		t1.start();
		t2.start();
	}

}
