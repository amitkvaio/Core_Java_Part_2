package finalize;

public class N {
	N obj;

	public static void main(String[] args)

	{
		N n1 = new N();
		N n2 = new N();
		N n3 = new N();
		n1.obj = n2;
		n2.obj = n3;
		n3.obj = n1;
		n1 = n2 = n3 = null;
		System.out.println("hello world");

	}

}
