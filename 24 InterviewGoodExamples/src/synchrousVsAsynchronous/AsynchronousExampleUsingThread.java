package synchrousVsAsynchronous;

public class AsynchronousExampleUsingThread {
	public static void main(String[] args) {
		System.out.println("Task 1: Start");

		Thread thread = new Thread(() -> {
			System.out.println("Task 2: Performing...");
			try {
				Thread.sleep(2000); // Simulating some work with a delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task 2: Completed");
		});

		thread.start(); // Start asynchronous execution

		System.out.println("Task 3: End");
	}
}

/*
In an asynchronous execution, tasks can run in parallel, 
	meaning the program doesn't wait for one task to finish before moving to the next.

Task 1: Start
Task 3: End
Task 2: Performing...
Task 2: Completed

Here, Task 3 executes without waiting for Task 2 to complete.

*/