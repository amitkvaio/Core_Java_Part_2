//62
package com.lara.pack02;

class Thread1 extends Thread
{
	Shared s1;
	
	Thread1(Shared s1)
	{
		this.s1=s1;
	}
	
	@Override
	public void run()
	{
		s1.test5();//A
	}
}


class Thread2 extends Thread
{
	Shared s1;
	
	Thread2(Shared s1)
	{
		this.s1=s1;
	}
	
	@Override
	public void run()
	{
		s1.test5();//B
	}
}

public class Manager1
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		
		Thread1 t1= new Thread1(s1);//C
		Thread2 t2 = new Thread2(s1);//D
		
		t1.start();
		t2.start();
	}
}
/*
 
Case 1
 A-test1() -object lock is not required - method is not synchronized
 B-test1() -object lock is not required - method is not synchronized
 C-s1
 D-s1
 result : simultaneously 
 
Case 2
 A-test1() -object lock is not required - method is not synchronized
 B-test2() -object lock is not required - method is not synchronized
 C-s1
 D-s1
 result : simultaneously
 
Case 3
 A-test2() -object lock is not required - method is not synchronized
 B-test2() -object lock is not required - method is not synchronized
 C-s1
 D-s1
 result : simultaneously
 
Case 4
 A-test2() - object lock is not required -object lock is available [Shared s1]- directly test2() method will execute
 B-test3() - required the object lock - it will take the object lock and call the synchronized method test3
 C-s1
 D-s1
 result : simultaneously
 
Case 5
 A-test3() -required the object lock - it will take the object lock and call the synchronized method test3
 B-test3() -required the object lock - it will take the object lock and call the synchronized method test3
 C-s1
 D-s1
 result : sequential 
 
Case 6
 A-test3() -required the object lock - it will take the object lock and call the synchronized method test3 once it release
 			the object lock, same object lock is acquired by other thread in order to call the synchronized method test4
 			of the same class
B-test4() -required the object lock - it will take the object lock and call the synchronized method test3
 C-s1
 D-s1
 result : sequential 
 
Case 7
 A-test4() -required the object lock - it will take the object lock and call the synchronized method test4 once it release
 			the object lock, same object lock is acquired by other thread in order to call the synchronized method test4
 			of the same class
 B-test4() -required the object lock - it will take the object lock and call the synchronized method test3
 C-s1
 D-s1
 result : sequential 
 
 Case 8
 A-test4() -required the object lock - it will take the object lock and call the synchronized method test4
 B-test5() -required the class lock - it will take the class lock and call the static synchronized method test5
 C-s1
 D-s1
 result : simultaneous
 
Case 9
 A-test5() -object lock is not required - method is not synchronized
 B-test5() -object lock is not required - method is not synchronized
 C-s1
 D-s1
 result : simultaneous
 
 
Case 10
 A-test5() -object lock is not required - method is not synchronized
 B-test6() -object lock is not required - method is not synchronized
 C-s1
 D-s1
 result : simultaneous
 
Case 11
 A-test6() -static  method 
 B-test6() -static  method  
 C-s1
 D-s1
 result : simultaneous
 
 
Case 12
 A-test6() -static method
 B-test7() -static synchronized method
 C-s1
 D-s1
 result : simultaneous
 
 
Case 13
 A-test7() --static synchronized method - class lock
 B-test7() --static synchronized method - class lock
 C-s1
 D-s1
 result : sequential
 
Case 14
 A-test7() --static synchronized method - class lock
 B-test8() --static synchronized method - class lock
 C-s1
 D-s1
 result : sequential
 
Case 15
 A-test8() --static synchronized method - class lock
 B-test8() --static synchronized method - class lock
 C-s1
 D-s1
 result : sequential
 
 Case 16
 A-test8() --static synchronized method - class lock
 B-test4() --synchronized method - object lock
 C-s1
 D-s1
 result : sequential
 */

