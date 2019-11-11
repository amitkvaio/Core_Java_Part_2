package com.sorting;

import java.util.Arrays;

public class EQuickSort
{
	public static void main(String[] args) {
		int arr [] = {5,10,20,15,25,3,2,17};
		quickSort(0, arr.length-1,arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int lower, int higher, int[] arr) {
		System.out.println("lowerIndex : " + lower + " higherIndex : " + higher);
		if (lower < higher) {
			int j = partition(lower, higher, arr);
			System.out.println("J->" + j);
			quickSort(lower, j, arr);
			quickSort(j + 1, higher, arr);
		}
	}
	
	public static int partition(int first, int last, int[] A) {
		int pivot = first;
		int i = first, j = last;
		System.out.println(Arrays.toString(A));
		/*while (i < j) {
			
			
			if (i < j)
				swap(A[i], A[j]);
		}
		 
		swap(A[first], A[j]);*/

		return j;
	}
	
	public static void swap(int first, int second) {
		int temp;
		temp = first;
		first = second;
		second = temp;
	}
}
