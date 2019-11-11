package com.lara2;

public class G
{
	public static void main(String[] args)
	{
		String s1 = "ab ab aba ab";
		//			 012345678901
		int i = s1.lastIndexOf('b',5);
		System.out.println(i);//4
		int j = s1.lastIndexOf('a',7);
		System.out.println(j);//6
	}
}
/*

lastIndexOf
public int lastIndexOf(int ch,
int fromIndex)
Returns the index within this string of the last occurrence of the specified character,
 searching backward starting at the specified index.
*/