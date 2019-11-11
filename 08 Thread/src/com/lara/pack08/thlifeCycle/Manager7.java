//74
package com.lara.pack08.thlifeCycle;
class G extends Thread
{
	@Override
	public void run()
	{
		System.out.println("begin");
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
public class Manager7
{
	public static void main(String[] args)
	{
		G g1 = new G();
		g1.start();
		
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		g1.stop();
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(g1.getState());
	}
}
