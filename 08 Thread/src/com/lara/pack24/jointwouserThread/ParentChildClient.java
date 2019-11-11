package com.lara.pack24.jointwouserThread;

public class ParentChildClient {
	public static void main(String[] args) {
		ParentThread parent = new ParentThread();
		ChildThread child = new ChildThread();
		
		Thread pthread = new Thread(parent, "ParentThread");
		Thread cThread = new Thread(child, "ChildThread");
		parent.setChildThread(cThread);
		cThread.start();
		pthread.start();
		
		System.out.println("Main thread finished Their taks!!");
	}
}
