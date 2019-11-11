//2. How to Remove Duplicates from Arrays in Java without using collection
package com.arrayList;

import java.util.Arrays;

public class B {
	public static void main(String[] args) {
		int [] list = new int[] {10,20,30,10,20};
		System.out.println("With Duplicate : "+Arrays.toString(list));
		int[] unique = removeDuplicatesFromArray(list);
		System.out.println("Without Duplicate :"+Arrays.toString(unique));
	}
	public static int[] removeDuplicatesFromArray(int[] arr) {

		// get size of the Arrays using length property
		int sizeOfArrays = arr.length;
		// remove duplicates, using 2 for-loops
		// outer for-loop
		for (int outForLoop = 0; outForLoop < sizeOfArrays; outForLoop++) {
			// inner for-loop
			for (int inForLoop = outForLoop + 1; inForLoop < sizeOfArrays; inForLoop++) {
				// check whether, it already contains this element
				if (arr[outForLoop] == arr[inForLoop]) {
					System.out.println("Befor outForLoop:"+outForLoop +"  InForLoop:"+inForLoop + " Size:"+sizeOfArrays + "Arrays :"+Arrays.toString(arr));
					// if elements are same, then replace with last item
					arr[inForLoop] = arr[sizeOfArrays - 1];
					// at the same time, decrement size value by 1
					sizeOfArrays--;
					// also decrement inner for-loop
					inForLoop--;
					System.out.println("After outForLoop:"+outForLoop +"  InForLoop:"+inForLoop + " Size:"+sizeOfArrays +"Arrays :"+Arrays.toString(arr));
					System.out.println("=============");
				}
			}
		}
		return Arrays.copyOf(arr, sizeOfArrays);
	}
	 
}
