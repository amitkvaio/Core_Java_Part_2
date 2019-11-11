package finalize;
class O
{
	int i =10;
	protected void finalize()throws Throwable
	{
		System.out.println("form finalize");
	}
}
class P
{
	public static void main(String[] args)
	{
		O o = new O();
		//System.gc();//
		System.out.println(o.i);
		o=null;
		System.gc();
		try
		{
			Thread.sleep(5*1000);
			
		}
		catch(InterruptedException ex)
		{
			
			ex.printStackTrace();
		}
		System.out.println("done");
	}
	
}
