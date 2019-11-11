import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

class Produser implements Runnable {

	CountDownLatch countDownLatch;

	public Produser(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		try {
			System.out.println("Before count :" + countDownLatch.getCount() + " " + thName);
			Thread.sleep(4000);
			countDownLatch.countDown();
			System.out.println("After count :" + countDownLatch.getCount() + " " + thName);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class Test {
	public static void main(String[] args) {
		try {
			CountDownLatch c = new CountDownLatch(3);
			Produser p1 = new Produser(c);
			Thread t1 = new Thread(p1, "Thread-1");
			Thread t2 = new Thread(p1, "Thread-2");
			Thread t3 = new Thread(p1, "Thread-3");
			System.out.println("Main Thread is waiting for child thread work to finish!!");
			t1.start();
			Thread.sleep(5000);
			t2.start();
			Thread.sleep(1000);
			t3.start();
			c.await();
			System.out.println("Child thread has finished work and Main thread resume their work!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
