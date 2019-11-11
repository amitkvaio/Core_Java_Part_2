package com.lara.pack17.reentraceLock;

public class ReentrantLockCustom implements LockCustom {
	int lockHoldCount;
   	
   	//Id of thread which is currently holding the lock.
   	long IdOfThreadCurrentlyHoldingLock;
   	
   	/*
   	  Creates an instance of ReentrantLock.
   	  Initially lock hold count is 0.
   	*/
   	ReentrantLockCustom(){
          	lockHoldCount=0;
          	System.out.println("LockHoldCunt Initialized with Zero : "+lockHoldCount);
   	}
   	
   	/*
   	 Acquires the lock if it is not held by another thread.
   	 	And sets lock hold count to 1.
   	 If current thread already holds lock then lock hold
   	 	count is increased by 1.
   	 If the lock is held by another thread then the current
   	 	thread waits for another thread to release lock.
   	*/
	public synchronized void lock() {

		// Acquires the lock if it is not held by another thread.
		// And sets lock hold count to 1.
		String thName  = Thread.currentThread().getName();
		if (lockHoldCount == 0) {
			lockHoldCount++;
			IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
			System.out.println("********* Inside if block of ReentrantLockCustom ****** "+thName +"lockHoldCount:"+lockHoldCount);
		}
		// If current thread already holds lock then lock hold
		// count is increased by 1.
		else if (lockHoldCount > 0 && IdOfThreadCurrentlyHoldingLock == Thread.currentThread().getId()) {
			lockHoldCount++;
			System.out.println("********* Inside else if block of ReentrantLockCustom ****** "+thName +"lockHoldCount:"+lockHoldCount);
		}
		// If the lock is held by another thread then the current
		// thread waits for another thread to release lock.
		else {
			System.out.println("********* Inside else block of ReentrantLockCustom ****** "+thName +"lockHoldCount:"+lockHoldCount);
			try {
				wait();
				lockHoldCount++;
				IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 
   	/*
   	 If the current thread is the holding the lock then the lock hold
   	 count is decremented by 1. If the lock hold count has reached 0,
   	 then the lock is released.
   	 If lock hold count is still greater than 0 then lock is not released.
   	 If the current thread is not holding the lock then
     IllegalMonitorStateException is thrown.
   	*/
	public synchronized void unlock() {
		String thName = Thread.currentThread().getName();
		// current thread is not holding the lock, throw IllegalMonitorStateException.
		System.out.println("inside Unlock : before decrement lockHoldCount-> "+lockHoldCount + " ThName "+thName);
		if (lockHoldCount == 0)
			throw new IllegalMonitorStateException();

		lockHoldCount--; // decrement lock hold count by 1
		System.out.println("inside Unlock : After decrement lockHoldCount-> "+lockHoldCount + " ThName "+thName);
		// if lockHoldCount is 0, lock is released, and
		// one waiting thread is notified.
		if (lockHoldCount == 0)
			notify();

	}
   	
   	/*
   	 Acquires the lock if it is not held by another thread and returns
   	 true. And sets lock hold count to 1.
   	 If current thread already holds lock then method
   	 returns true. And increments lock hold count by 1.
   	 If lock is held by another thread then method return false.
   	 */
   	
	public synchronized boolean tryLock() {
		// Acquires the lock if it is not held by another thread and
		// returns true
		if (lockHoldCount == 0) {
			lock();
			return true;
		}
		// If lock is held by another thread then method return false.
		else
			return false;
	}
	//Core Java With OCJP/SCJP: Multithreading Enhancement Part- 3
}
