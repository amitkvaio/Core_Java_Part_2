package com.lara.pack12.threadGroup;

public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println("Parent Name : "+g1.getParent().getName());
		ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
		System.out.println("Parent Name : "+g2.getParent().getName());
	}
}
