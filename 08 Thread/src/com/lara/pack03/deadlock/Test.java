package com.lara.pack03.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class AA{

	public void method2() {
		synchronized (String.class) {
			System.out.println("From method2 holding the class lock of String!!");
			synchronized (Integer.class) {
				System.out.println("From method2 holding the Integer lock");
			}
		}
	}

	public void method1() {
		synchronized (Integer.class) {
			System.out.println("From method1 holding the class lock of Integer!!");
			synchronized (String.class) {
				System.out.println("From method1 holding the String lock");
			}
		}
	}
	
}
class BB extends Thread{
	AA aa ;
	public BB(AA aa) {
		this.aa=aa;
	}
	@Override
	public void run() {
		aa.method1();
	}
}

class CC extends Thread{
	AA aa ;
	public CC(AA aa) {
		this.aa=aa;
	}
	@Override
	public void run() {
		aa.method2();
	}
}

//create Deadlock
public class Test {
	
	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB(aa);
		CC cc = new CC(aa);
		bb.start();
		cc.start();
		System.out.println("Done");
		
		ThreadMXBean th =ManagementFactory.getThreadMXBean();
		long idies[]=th.findDeadlockedThreads();
		ThreadInfo threadInfo =null;
		if(idies!=null) {
			for (int i = 0; i < idies.length; i++) {
				threadInfo =th.getThreadInfo(idies[i]);
				System.out.println(threadInfo.getThreadName());
			}
		}else {
			System.out.println("No Threads are in locked");
		}
		
	}
}
