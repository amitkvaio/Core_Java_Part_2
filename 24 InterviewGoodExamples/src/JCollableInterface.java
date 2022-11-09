import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JCollableInterface {
	public static void main(String[] args) {
		try {
			Call call = new Call();
			ExecutorService executer = Executors.newFixedThreadPool(1);
			Future<String> submit = executer.submit(call);
			System.out.println(submit.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

class Call implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "Call to Amit.";
	}
}