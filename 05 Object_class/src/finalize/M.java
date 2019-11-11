package finalize;

public class M {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("from finalize");

	}

	public static void main(String[] args) {
		M m1 = new M();
		m1 = null;
		System.out.println("obj became abandoned");

		Runtime.getRuntime().gc();
		try

		{
			Thread.sleep(60 * 1000);

		} catch (InterruptedException ex) {

			ex.printStackTrace();
		}
		System.out.println("end");
	}

}
