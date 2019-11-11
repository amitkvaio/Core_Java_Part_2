/* 2 Program to cyclically rotate an array by one
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
*/
package com01.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Manager02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Enter the size of the Arrays");
			int arrSize = sc.nextInt();
			System.out.println("Enter the " + arrSize + " Elements :");
			int[] arr = new int[arrSize];
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}

			System.out.println("Your Given Arrays is : " + Arrays.toString(arr));
			
			//1
			int temp = arr[arrSize - 1]; 
			System.out.println("temp:" + temp);
			//2
			for (int i = arrSize - 1; i >= 1; i--)
			{
				arr[i] = arr[i - 1];
			}
			//3
			arr[0] = temp;
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter you choice Y|N:");
		} while ("Y".equalsIgnoreCase(sc.next()));
	}
}
/*

Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.

*/