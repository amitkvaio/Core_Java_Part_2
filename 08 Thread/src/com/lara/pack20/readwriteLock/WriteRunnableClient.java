package com.lara.pack20.readwriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteRunnableClient {
	public static void main(String[] args) {
		ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
		WriteRunnable writeRunnable = new WriteRunnable(writeLock);
		Thread th1 = new   Thread(writeRunnable,"Thread-1");
		Thread th2 = new   Thread(writeRunnable,"Thread-2");
		Thread th3 = new   Thread(writeRunnable,"Thread-3");
		Thread th4 = new   Thread(writeRunnable,"Thread-4");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}

/*
Thread-3 has acquired the lock!
1
4
Thread-3 has released the lock!
Thread-3 acquired and released writeLock, thread-1,2,4 was waiting to acquire writeLock.

Thread-1 has acquired the lock!
1
4
Thread-1 has released the lock!
Thread-1 acquired and released writeLock, thread-2,4 was waiting to acquire writeLock.

Thread-2 has acquired the lock!
1
4
Thread-2 has released the lock!
Thread-2 acquired and released writeLock, thread-4 was waiting to acquire writeLock.

Thread-4 has acquired the lock!
1
4
Thread-4 has released the lock!
Thread-4 acquired and released writeLock,No thread is waiting for writeLock.

*/