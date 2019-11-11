package com.sorting;

public class ABubbleSortRecursive
{
	public static void main(String[] args) {
		int[] arr = {10,15,5,7,20};
		int length = arr.length;
		bubbleSort(arr, length);
		printArrays(arr, length);
	}
	
	public static void bubbleSort(int[] arr, int n) {
		if(n==1)
			return;
		int temp;
		for (int i = 0; i < n-1; i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i] =arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubbleSort(arr, n-1);
	}
	
	public static void printArrays(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
