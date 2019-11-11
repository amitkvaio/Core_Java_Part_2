package com.lara.pack10.threadLocal;

public class ThreadLocalDemo2 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());//null
		tl.set("Amit");
		System.out.println(tl.get());//Amit
		tl.remove();
		System.out.println(tl.get());//null
	}
}
