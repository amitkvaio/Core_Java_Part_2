package com01.pattern;

import java.util.Scanner;

public class Manager07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter the Number of Rows :");
			int noRaws = sc.nextInt();
			System.out.println("Enter the Number of column : ");
			int noColumn = sc.nextInt();
			
			for (int i = noRaws;  i>= 1;i--) // for rows
			{
				for (int j = noColumn; j >= 1; j--) // for column printing
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("Would you want re-run the progrem Y|N :");
		}while("Y".equalsIgnoreCase(sc.next()));
		System.out.println("***THANK YOU!!***");
	}
}
/*

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/