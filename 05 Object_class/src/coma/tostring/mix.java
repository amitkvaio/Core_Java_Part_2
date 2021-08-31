package coma.tostring;
class C1
{
	int i;
	double d;
	C1(int i, double d)
	{
		this.i = i;
		this.d=d;
	}
}
public class mix
{
	public static void main(String[] args)
	{
		C1 obj = new C1(10,20.90);
		System.out.println(obj);//calling the toString() of the object class so it will give the memory representation.
		System.out.println("........");
		
		
		obj = null;//obj is null not pointing anywhere
		System.out.println(obj);//print the null as
		System.out.println(".......");
		
		
		String s1 = obj.toString();//looking for memory address but memory is not available so it will give the NPE
		System.out.println(s1);
		
	}
}
