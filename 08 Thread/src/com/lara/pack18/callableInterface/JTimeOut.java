package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
Adding Timeouts
The future.get() method blocks and waits for the task to complete. 
If you call an API from a remote service in the callable task and the remote service is down, 
then future.get() will block forever, which will make the application unresponsive.

To guard against this fact, you can add a timeout in the get() method -

The future.get() method will throw a TimeoutException if the task is not completed 
within the specified time.
*/
public class JTimeOut {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		JTimeOut jTimeOut = new  JTimeOut();
		jTimeOut.timout();
		System.out.println("********* Main method done*********");
	}

	private void timout() throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> future = executorService.submit(() -> {
			Thread.sleep(2000);
			String thName = Thread.currentThread().getName();
			System.out.println(thName+" *******I am going to sleep forever********");
			waitThread();
			return "Hello from Callable";
		});

		System.out.println("******* Waiting for timeout *****");
		future.get(5, TimeUnit.SECONDS);
		
		String result = future.get();
		System.out.println(result);

		executorService.shutdown();
	}
	
	public void waitThread() {
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
output
******* Waiting for timeout *****
pool-1-thread-1 *******I am going to sleep forever********
Exception in thread "main" java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at com.lara.pack18.callableInterface.JTimeOut.timout(JTimeOut.java:40)
	at com.lara.pack18.callableInterface.JTimeOut.main(JTimeOut.java:24)

 */
