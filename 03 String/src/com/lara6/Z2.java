package com.lara6;

import java.text.NumberFormat;
import java.text.ParseException;

public class Z2
{
	public static void main(String[] args)
	{
		double num = 9876987.987654;
		System.out.println(num);
		NumberFormat nf1 = NumberFormat.getInstance();
		String s1=nf1.format(num);
		System.out.println(s1);
		
		
		try
		{
			Number num1 = nf1.parse(s1);
			System.out.println(num1);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
}
