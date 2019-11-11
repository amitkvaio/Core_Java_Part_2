package com.lara.pool;

import java.util.ArrayList;

class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ModelThread extends Thread {
	
	public synchronized void goToWait() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void release() {
		notify();
	}

	@Override
	public void run() {
		
		while (true) {
			goToWait();
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + ":" + i);
				Util.sleep(100);
			}
			release();
		}
	}
}

class ThreadPoolManager {
	
	private ArrayList<ModelThread> pool = new ArrayList<ModelThread>();

	public void init() {
		ModelThread th = null;
		for (int i = 0; i < 10; i++) {
			th = new ModelThread();
			th.start();
			pool.add(th);
		}
	}

	public ModelThread getThread() {
		ModelThread th = null;
		if (pool.size() > 0) {
			th = pool.remove(0);
		} else {
			th = new ModelThread();
			th.start();
		}
		return th;
	}

	public void setThread(ModelThread th) {
		if (pool.size() < 10) {
			pool.add(th);
		}
	}

	public void release() {
		ModelThread th = null;
		for (int i = 0; i < pool.size();) {
			th = (ModelThread) pool.remove(i);
		}
	}
}

class User1 extends Thread {
	ThreadPoolManager pm = null;

	User1(ThreadPoolManager pm) {
		this.pm = pm;
	}

	@Override
	public void run() {
		while (true) {
			ModelThread th = pm.getThread();
			th.release();
			th.goToWait();
			pm.setThread(th);
			Util.sleep(3000);
		}
	}
}

public class Manager {
	public static void main(String[] args) {
		ThreadPoolManager pm = new ThreadPoolManager();
		pm.init();
		User1 u1 = new User1(pm);
		u1.start();
		User1 u2 = new User1(pm);
		u2.start();
		User1 u3 = new User1(pm);
		u3.start();
		pm.release();
		System.out.println("end of the game");

	}
}
