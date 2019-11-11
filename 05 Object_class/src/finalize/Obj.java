package finalize;

public class Obj 
{
	int count;
	public Obj()
	{
	
		count++;
		
		System.out.println(count);
		
	}
	public static void main(String[] args)
	{
		Obj o1=new Obj();
		Obj o2=new Obj();
	}

}
