/*
3
Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements. 
*/
package com01.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Manager03
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
			System.out.println("How many elements you want to rotate : ");
			int rotateSize = sc.nextInt();
			System.out.println("Your Given Arrays is : " + Arrays.toString(arr));
			
			rotate(arr, 0, rotateSize-1);
			System.out.println("First Rotation : " + Arrays.toString(arr));
			
			rotate(arr, rotateSize, arrSize-1);
			System.out.println("Second Rotation : " + Arrays.toString(arr));
			
			rotate(arr, 0, arrSize-1);
			System.out.println("Final Rotation : " + Arrays.toString(arr));
			
			System.out.println("Enter you choice Y|N:");
		} while ("Y".equalsIgnoreCase(sc.next()));
	}
	
	public static void rotate(int arr[], int startIndex, int endIndex)
	{
		while (startIndex < endIndex)
		{
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	
}
