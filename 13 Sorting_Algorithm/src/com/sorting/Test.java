package com.sorting;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int arr [] = {38,52,9,18,6,62,13};
		System.out.println("Before Selection sorting : "+Arrays.toString(arr));
		int minIndex=0,temp;
		for (int i = 0; i < arr.length; i++) {
			minIndex=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("After Selection sorting : "+Arrays.toString(arr));
	}
}
