package com01.pattern;

import java.util.Scanner;

public class Manager34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter the Number of Rows :");
			int noRaws = sc.nextInt();
			int blankSpace = noRaws;

			for (int i = 1; i <= noRaws; i++) // for rows
			{
				for (int j = blankSpace; j >= 1; j--)
				{
					if (j > i)
					{
						System.out.print(" ");
					} else
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("Would you want re-run the progrem Y|N :");
		} while ("Y".equalsIgnoreCase(sc.next()));
		System.out.println("***THANK YOU!!***");
	}                                                                             
}
