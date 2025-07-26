package synchrousVsAsynchronous;

public class SynchronousExample {

	public static void main(String[] args) {
		System.out.println("Task 1: Start");
		performTask();
		System.out.println("Task 3: End");
	}

	public static void performTask() {
		System.out.println("Task 2: Performing...");
		try {
			Thread.sleep(2000); // Simulating some work with a delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task 2: Completed");
	}
}
/*

In a synchronous execution, tasks are executed sequentially, 
	meaning one task must complete before the next one starts.

Task 1: Start
Task 2: Performing...
Task 2: Completed
Task 3: End

Here, Task 2 must complete before Task 3 starts.



*/