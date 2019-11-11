
public class F
{
	int i ; //used only non static block.
	static int j;//can be used any where in the class F
	void test1()
	{
		i = 1;
		j=2;
		test1();
		test2();
		G g1 = new G();
		H h1 = new H();
		
	}
	static void test2()
	{
		//i = 1;//i is non static it can not be used inside the static block.
		j = 2;
		//test1();//non static not, it can not be used inside the static method.
		test2();
		//G g1 = new G();//G is non static class we can not use here
		H h1 = new H();
	}

// Inside the non- static inner class we can not able to developed any static member.
	//
	class G
	{
		int m;
		//static int n;
		void test3()
		{
			i = 10;
			j =20;
			F.j = 20;
			test1();
			test2();
			F.test2();
				
			G g1 = new G();
			H h1 = new H();
			m = 20;
			//n=20;//n is static so we can not use it inside the non static block.
		}
	/*
		static void test4()
		{
			i = 10;
			j = 20;
			test1();
			test2();
			G g1 = new G();
			H h1 = new H();
			m = 20;// m is non static we can not use it inside the static body
			n = 20;
		}
		
		inside non-static inner class we can not develop any static memeber.
	*/
	}

	static class H
	{
		int p;
		static int q;
		void test5()
		{
			//i=1;//non static
			//test1();//non static
			test2();
			p=0;
			q=9;
			j=20;
			//G g1 = new G();//non static clss
			H h1 = new H();
		
		}
		static void test6()
		{
			//i=10;//non static memeber
			j=20;
			//test1();//non static memeber
			test2();
			//p = 9;// non static member
			q = 10;
			//G g1 = new G();//non static class;
			H h1 = new H();
		}
	}
}