package com.lara.pack12.threadGroup;
class MyThread extends Thread{
	public MyThread(ThreadGroup g, String name) {
		super(g,name);
	}
	@Override
	public void run() {
		System.out.println("Chiled Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadGroupDemo3 {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parents Group");
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");
		
		MyThread t1 = new MyThread(pg, "ChildThread1");
		MyThread t2 = new MyThread(pg, "ChildThread1");
		t1.start();
		t2.start();
		
	
		System.out.println(pg.activeCount());//2
		System.out.println(pg.activeGroupCount());//1
		System.out.println("----------11---------------");
		pg.list();
		System.out.println("----------22--------------");
		Thread.sleep(10000);
		System.out.println(pg.activeCount());//0
		System.out.println(pg.activeGroupCount());//1
		System.out.println(cg.activeGroupCount());//0
		System.out.println("-----------33-----------------");
		pg.list();
		System.out.println("-----------44-----------------");
	}
}
