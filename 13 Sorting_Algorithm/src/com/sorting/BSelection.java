package com.sorting;

public class BSelection
{
	public static void main(String[] args) {
		//			  0   1 2  3 4  5  6  
		int arr [] = {38,52,9,18,6,62,13};
		int length = arr.length;
		selectionSorting(arr, length);
		printArrays(arr, length);
	}
	
	public static void selectionSorting(int[] arr, int n) {
		int minValueIndex, temp;
		for (int i = 0; i <n; i++) {
			minValueIndex=i;
			for (int j = i+1; j < n; j++) {
				if(arr[j]<arr[minValueIndex]) {
					minValueIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minValueIndex];
			arr[minValueIndex]=temp;
		}
	}
	
	public static void printArrays(int[] arr, int n) {
		System.out.println("Sorted Elements are : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
