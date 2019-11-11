//1 Program for array rotation
package com01.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Manager01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter the size of the Arrays");
			int arrSize =sc.nextInt();
			System.out.println("Enter the "+arrSize +" Elements :");
			int [] arr = new int[arrSize];
			for (int i = 0; i < arr.length; i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Your Given Arrays is : " + Arrays.toString(arr));
			
			System.out.println("How many elements you want ot rotate :");
			int noRotate = sc.nextInt();
			int [] arrTemp = new int[noRotate]; 
			//1
			for (int j = 0; j < noRotate; j++)
			{
				arrTemp[j] = arr[j];
			}
			
			//2
			for (int i = 0; i < arrSize-noRotate; i++)
			{
				arr[i] =arr[noRotate+i];
			}
			//3
			for (int i = 0; i < noRotate; i++)
			{
				arr[arrSize-noRotate+i]=arrTemp[i];
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter you choice Y|N:");
		}while("Y".equalsIgnoreCase(sc.next()));
	}
}

/*
Input : [1, 2, 3, 4, 5, 6, 7]
output : [3, 4, 5, 6, 7, 1, 2]

Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]
*/