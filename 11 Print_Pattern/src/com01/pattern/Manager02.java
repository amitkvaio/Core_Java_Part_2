package com01.pattern;

import java.util.Scanner;

public class Manager02
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
			
			for (int i = 1;  i<= noRaws;i++) // for rows
			{
				for (int j = 1; j <= noColumn; j++) // for column printing
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			System.out.println("Would you want re-run the progrem Y|N :");
		}while("Y".equalsIgnoreCase(sc.next()));
		System.out.println("***THANK YOU!!***");
	}
}
/*

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5

*/