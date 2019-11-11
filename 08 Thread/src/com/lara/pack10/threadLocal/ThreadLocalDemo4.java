package com.lara.pack10.threadLocal;
class ParentsThread extends Thread{
	public static InheritableThreadLocal tl  = new InheritableThreadLocal() {
		protected Object childValue(Object parentValue) {
			return "CC";
		}
	};
	
	@Override
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value :"+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread Vlaue--"+ParentsThread.tl.get());
	}
}
public class ThreadLocalDemo4 {
	public static void main(String[] args) {
		ParentsThread pt = new ParentsThread();
		pt.start();
	}
}
