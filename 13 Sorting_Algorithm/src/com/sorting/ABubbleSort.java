package com.sorting;

public class ABubbleSort
{
	public static void main(String[] args) {
		//int[] arr = { 5,1,4,2,8 };
		int[] arr = {11, 17, 18, 26, 23};
		int arrLength = arr.length;
		bubbleSort(arr,arrLength);
		printArrays(arr,arrLength);
	}

	public static void bubbleSort(int[] arr, int arrLength) {
		int temp;
		for (int i = 0; i < arrLength; i++) {
			int swap = 0;
			for (int j = 0; j < arrLength - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					System.out.println(arr[j] + " " +arr[j+1]);
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = 1;
					System.out.println(arr[j] + " " +arr[j+1]);
				}
			}
			if (swap == 0) {
				break;
			}
		}
	}

	public static void printArrays(int[] arr, int arrLength) {
		System.out.println("Sorted Elements are : ");
		for (int i = 0; i < arrLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
