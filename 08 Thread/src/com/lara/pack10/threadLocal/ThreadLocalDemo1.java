package com.lara.pack10.threadLocal;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());//null
		tl.set("Amit");
		System.out.println(tl.get());//Amit
		tl.remove();
		System.out.println(tl.get());//null
	}
}
