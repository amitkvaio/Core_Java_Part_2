package com.lara.pack20.readwriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadRunnableClient {
	public static void main(String[] args) {
		ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		ReadRunnable readRunnable = new ReadRunnable(readWriteLock);
		Thread th1 = new   Thread(readRunnable,"Thread-1");
		Thread th2 = new   Thread(readRunnable,"Thread-2");
		Thread th3 = new   Thread(readRunnable,"Thread-3");
		Thread th4 = new   Thread(readRunnable,"Thread-4");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
/*
Thread-1 has acquired read lock.
Thread-4 has acquired read lock.
Thread-3 has acquired read lock.
Thread-2 has acquired read lock.
Thread-1,Thread-2,Thread-3 and Thread-4 were able to acquire readLock at same time.
Thread-4 has released read lock.
Thread-2 has released read lock.
Thread-1 has released read lock.
Thread-3 has released read lock.

*/
