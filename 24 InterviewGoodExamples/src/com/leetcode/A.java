package com.leetcode;
//Find the length of last word.
public class A {
	public static void main(String[] args) {
		String str = "Ranchi is the capital city of Jharkhand";
		int length = lengthOfLastWord(str);
		System.out.println(length);
	}
	public static int lengthOfLastWord(String str) {
		int count = 0;
		int n = str.length();
		int i = 0;
		while (i < n) {
			if (str.charAt(i) != ' ') {
				count++;
				i++;
			} else {
				// current char is space.
				while (str.charAt(i) == ' ') {
					i++;
				}

				// End of string
				if (i == n) {
					return count;
				} else {
					count = 0;
				}
			}
		}
		return count;
	}
}

/*
For this problem we have three solution
1. We can reverse the string and find the length of first word.
2. We can iterate the string from the last till first space encountered and will count the length.
3. We can iterate from the first and will increase the count and when space encounter
	will initialize the count variable by zero when we reached at last then will return the count.
	
Space Complexity
	O(1)
Time Complexity
	O(n)
*/