package com.lara.pack02;
class Thread3 extends Thread
{
	Shared s1;
	
	Thread3(Shared s1)
	{
		this.s1=s1;
	}
	
	@Override
	public void run()
	{
		s1.test3();//A
	}
}

class Thread4 extends Thread
{
	Shared s1;
	
	Thread4(Shared s1)
	{
		this.s1=s1;
	}
	
	@Override
	public void run()
	{
		s1.test3();//B
	}
}
public class Manager2
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		Thread3 t1 = new Thread3(s1);// C
		Thread4 t2 = new Thread4(s2);// D

		t1.start();
		t2.start();
	}
}

/*
 Case 17
 A-test1() --non synchronized method 
 B-test1() --non synchronized method 
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous

 Case 18
 A-test1() --non synchronized method 
 B-test2() --non synchronized method 
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous

 Case 19
 A-test2() --non synchronized method 
 B-test2() --non synchronized method 
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 20
 A-test2() --non synchronized method 
 B-test3() --synchronized method  - object lock is required
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 21
 A-test3() --synchronized method - object lock is required
 B-test3() --synchronized method  - object lock is required
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 
 Case 22
 A-test3() --synchronized method - object lock is required
 B-test4() --synchronized method - object lock is required
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 23
 A-test4() --synchronized method - object lock is required
 B-test4() --synchronized method  - object lock is required
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 24
 A-test4() --synchronized method - object lock is required
 B-test5() --static method
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 25
 A-test5() --static method
 B-test5() --static method
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 26
 A-test6() --static method
 B-test6() --static method
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 27
 A-test6() --static method
 B-test7() --static synchronized method - class lock is required
 C-s1
 D-s2
 Execution will be independent
 Result : simultaneous
 
 Case 28
 A-test7() --static synchronized method - class lock is required
 B-test7() --static synchronized method - class lock is required
 C-s1
 D-s2
 Since Shared class having only one class lock and that class lock shared between s1 and s2
 Result : sequential
 
 Case 29
 A-test7() --static synchronized method - class lock is required
 B-test8() --static synchronized method - class lock is required
 C-s1
 D-s2
 Since Shared class having only one class lock and that class lock shared between s1 and s2
 Result : sequential
 
 Case 29
 A-test8() --static synchronized method - class lock is required
 B-test8() --static synchronized method - class lock is required
 C-s1
 D-s2
 Since Shared class having only one class lock and that class lock shared between s1 and s2
 Result : sequential

*/