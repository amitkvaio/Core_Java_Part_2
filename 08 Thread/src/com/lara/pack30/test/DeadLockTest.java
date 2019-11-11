package com.lara.pack30.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Shared{
	public void method1() {
		synchronized (String.class) {
			System.out.println("From method1 - String.class");
			synchronized (Integer.class) {
				System.out.println("From method1 - Integer.class");
			}
		}
	}
	
	public void method2() {
		synchronized (Integer.class) {
			System.out.println("From method2 - Integer.class");
			synchronized (String.class) {
				System.out.println("From method2 - String.class");
			}
		}
	}
}

class Test1 extends Thread{
	Shared shared;
	public Test1(Shared shared) {
		this.shared=shared;
	}
	@Override
	public void run() {
		shared.method1();
	}
}

class Test2  extends Thread{
	Shared shared;
	public Test2(Shared shared) {
		this.shared=shared;
	}
	@Override
	public void run() {
		shared.method2();
	}
}
 
public class DeadLockTest {
	public static void main(String[] args) {
		Shared shared = new Shared();
		
		Test1 t1 =new Test1(shared);
		Test2 t2 =new Test2(shared);
		t1.start();
		t2.start();
		System.out.println("finished");
		getDeadLockThreadInfo();
	}
	
	public static void getDeadLockThreadInfo() {
		ThreadMXBean mxBean=ManagementFactory.getThreadMXBean();
		long[] ids=mxBean.getAllThreadIds();
		if(ids!=null) {
			ThreadInfo[] infos =mxBean.getThreadInfo(ids);
			ThreadInfo thInfo = null;
			for (int i = 0; i < infos.length; i++) {
				thInfo = infos[i];
				System.out.println("Dead Lock thread Name : "+thInfo.getThreadName());
			}
		}else {
			System.out.println("No thread are in dead lock situation.");
		}
	}
}
