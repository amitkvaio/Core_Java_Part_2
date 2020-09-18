package com.lara1;

public class O {
	public static void main(String[] args) {
		String s1 = null;// null
		String s2 = s1 + null;// nullnull
		String s3 = null + s1;// nullnull
		String s4 = "abc" + null;// abcnull
		String s5 = s1 + "abc";// nullabc
		String s6 = s1 + s1;// nullnull
		String s7 = s1 + 2000;// null2000
		String s8 = 400 + s1;// 400null
		// String s9 = null+ 10 ;//cte
		// String s10 = 90+ null ;//cte
		// String s11 = 90+80 ;//cte
		// String s12 = null+ null ;//cte
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

	}
}
//at least one string reference should be needed