package com09.deloping.own.ClassDevlopement;

public class StackDevelopUse {
	public static void main(String[] args) {
		StackDevelop stack = new StackDevelop();
		System.out.println("Stack Capacity : " + stack.capacity());
		System.out.println("Initial Size : " + stack.size());
		stack.add(10);
		stack.add(110);
		stack.add(120);
		stack.add(130);

		System.out.println(stack);
		System.out.println("Stack Capacity : " + stack.capacity());
		int stacksize = stack.size();
		System.out.println("Initial Size : " + stacksize);

		System.out.println("==============================");
		for (int i = 0; i < stacksize; i++) {
			stack.process();
			System.out.println(stack);
		}
		System.out.println("==============================");

		/*StringBuffer sb = new StringBuffer(" ");
		System.out.println("str:"+sb);
		String str = "[" +sb.substring(0, sb.length()-1) + "]";
		System.out.println(str);*/
	}
}
