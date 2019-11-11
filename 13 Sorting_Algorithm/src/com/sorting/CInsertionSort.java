package com.sorting;

public class CInsertionSort
{
	public static void main(String[] args) {
		//index       0 1 2 3 4 5
		int [] arr = {5,1,6,2,4,3};
		int length = arr.length;
		//insertionSort(arr, length);
		insertionSortUsing4loop(arr,length);
		printArrays(arr, length);
	}
	
	public static void insertionSort(int []arr , int n) {
		int j , temp;
		for (int i = 1; i < n; i++) {
			temp = arr[i];
			j=i-1;
			while( j >=0 && arr[j] > temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void insertionSortUsing4loop(int []arr , int n) {
		int temp;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 ; j--) {
				if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
			}
		}
	}
	
	public static void printArrays(int[] arr ,int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
