package aic;
interface Switch
{
	void on();
	void off();
}
class Fan
{
	private boolean runningStatus;
	public Switch getSwithc()
	{
		return new Switch()
		{
			
			@Override
			public void on()
			{
				runningStatus = true;
				
			}
			
			@Override
			public void off()
			{
				runningStatus=false;
				
			}
		};
	}
	public boolean getRunningStatus()
	{
		return runningStatus;
	}
}

public class Manager14
{
	public static void main(String[] args)
	{
		Fan f1 = new Fan();
		Switch s1 = f1.getSwithc();
		s1.on();
		System.out.println(f1.getRunningStatus());
		s1.off();
		System.out.println(f1.getRunningStatus());
	}
}
