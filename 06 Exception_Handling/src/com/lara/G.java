package com.lara;

public class G
{
	public static void main(String[] args)
	{
		System.out.println(1);
		main(args);
		System.out.println(2);
	}
}

/*

main(args):again calling main() method keep on going never stopping process
it is also one of the abnormal condition.
initially a-lot of main() method is calling finally it gives exception
several main() is going into the memory'
whole stack memory is full with main() method after that it will give the 
Exception in thread "main" java.lang.StackOverflowError

*/