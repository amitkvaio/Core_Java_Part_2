package com.sorting;

public class ABubbleSortString
{
	public static void main(String[] args) {
		String [] str = {"rakesh","kumar","rinku","soni","amit"};
		int length = str.length;
		bubbleSort(str, length);
		printArrays(str, length);
	}
	
	public static void bubbleSort(String[]str , int n) {
		String temp="";
		
		for (int i = 0; i < n; i++) {
			int swap =0;
			for (int j = 0; j < n-1-i; j++) {
				if((str[i].compareTo(str[j+1]))>0) {
					temp = str[i];
					str[i]=str[j+1];
					str[j+1]=temp;
					swap=1;
				}
			}
			if(swap==1) {
				break;
			}
		}
	}
	
	public static void printArrays(String[] str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(str[i]+" ");
		}
	}
}