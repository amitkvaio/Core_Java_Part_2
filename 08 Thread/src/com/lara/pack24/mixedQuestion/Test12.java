package com.lara.pack24.mixedQuestion;


class Logic {
	public void evlauation() {
		int i=1;
		while(true) {
			String thName = Thread.currentThread().getName();
			synchronized (this) {
				try {
					this.notify();
					if("ONE".equals(thName) && i%3==1) {
						System.out.println(thName +"--"+ i);
					}else if("TWO".equals(thName) && i%3==2) {
						System.out.println(thName +"--"+ i);
					}else if("THREE".equals(thName) && i%3==0) {
						System.out.println(thName +"--"+ i);
					}
					i++;
					Thread.sleep(500);
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

class Kumar implements Runnable{
	Logic logic;
	
	public Kumar(Logic logic) {
		this.logic=logic;
	}
	
	@Override
	public void run() {
		logic.evlauation();
	}
	
}


public class Test12 {
	public static void main(String[] args) throws InterruptedException {
		Logic logic = new Logic();
		Kumar k1 = new Kumar(logic);
		Kumar k2 = new Kumar(logic);
		Kumar k3 = new Kumar(logic);
		
		Thread th1 = new Thread(k1, "ONE");
		Thread th2 = new Thread(k2,"TWO");
		Thread th3 = new Thread(k3,"THREE");
		
		th1.start();
		Thread.sleep(200);
		th2.start();
		Thread.sleep(200);
		th3.start();
		System.out.println("Main Finished");
		
	}
}
