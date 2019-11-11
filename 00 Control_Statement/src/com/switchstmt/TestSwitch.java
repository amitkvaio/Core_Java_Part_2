package com.switchstmt;

public class TestSwitch
{
	public static void main(String[] args)
	{
		int a=20;
		
		switch(a) {
		case 10 :
			System.out.println("TEN");
			break;
		case 20 :
			System.out.println("TWENTY");
			break;
		case 30 :
			System.out.println("THIRTY");
			break;
		case 40 :
			System.out.println("FOURTY");
			break;
		default :
			System.out.println("Default");
			break;
		}
	}
}
