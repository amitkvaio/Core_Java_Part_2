class R
{

	enum En
	{
		C1, C2, C3, C4;// semi colon is optional
	}
}

class S
{
	public static void main(String[] args)
	{
		R.En e1 = R.En.C4;
		R.En e2 = R.En.C2;
		System.out.println(e1);
		System.out.println(e2);
	}

}
