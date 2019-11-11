package finalize;

public class Test
{
	Test obj;
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.obj=t2;
		t2.obj=t3;
		t3.obj=t1;
		t1=t1=t3=null;
		System.out.println("mark");
	}
}

/*
t1 is pointing to one object where t2 is pointing;
t2 is pointing to one object where t3 is pointing;
t3 is pointing to one object where t1 is pointing;
 
all object have obj reference
all three objects which are abandoned now are eligible for garbage collector.
*/