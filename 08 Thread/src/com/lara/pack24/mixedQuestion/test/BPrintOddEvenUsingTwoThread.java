package com.lara.pack24.mixedQuestion.test;

class D{
	public void printOddEven() {
		String thName = Thread.currentThread().getName();
		int i = 0;
		while(true) {
			try {
				synchronized (this) {
					this.notify();
					if("EVEN".equals(thName) && i%2==0) {
						System.out.println(thName +"-"+i);
					}else if("ODD".equals(thName) && i%2==1) {
						System.out.println(thName +"-"+i);
					}
					i++;
					Thread.sleep(1000);
					this.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class E implements Runnable{
	D d;
	public E(D d) {
		this.d =d ;
	}
	
	@Override
	public void run() {
		d.printOddEven();
	}
}

public class BPrintOddEvenUsingTwoThread {
	public static void main(String[] args) {
		D d   = new  D();
		E e = new  E(d);
		Thread th1 = new Thread(e, "EVEN");
		Thread th2 = new Thread(e, "ODD");
		th1.start();
		th2.start();
		System.out.println("Main Finished");
		
	}
}
