package com.lara.pack24.jointwouserThread;

public class ParallelTask implements Runnable {
	private Thread predecessor;

	@Override
	public void run() {
		String thName =Thread.currentThread().getName();
		System.out.println(thName +" Started!!");
		if (predecessor != null) {

			try {
				predecessor.join();
				Thread.sleep(5000);
				
				for (int i = 0; i <= 10; i++) {
					System.out.println(thName +" After join");
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " Finished");
	}

	public void setPredecessor(Thread t) {
        this.predecessor = t;
    }
}
