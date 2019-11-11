package com.lara.pack17.reentraceLock;

public interface LockCustom {
	void lock();
	void unlock();
	boolean tryLock();
}
/*
 --> A lock helps in controlling access to a shared resource by multiple threads.
 
--> Only one thread at a time can acquire the lock and access the shared resource.
 		If a second thread attempts to acquire the lock on shared resource when it is
 		acquired by another thread, the second thread will wait until the lock is released.
 
--> In this way we can achieve synchronization and race conditions can be avoided.
*/