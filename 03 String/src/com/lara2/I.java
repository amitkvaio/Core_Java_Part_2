package com.lara2;

public class I {
	public static void main(String[] args) {
		String s1 = "lara tech";
		// 012345678
		String s2 = s1.substring(0, 4);
		System.out.println(s2);
		String s3 = s1.substring(5, 9);
		System.out.println(s3);

	}
}
/*
substring
public String substring(int beginIndex,int endIndex)
Returns a new string that is a substring of this string. 
The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
 Thus the length of the substring is endIndex-beginIndex. 
Examples: 
 "hamburger".substring(4, 8) returns "urge"
  012345678
 "smiles".substring(1, 5) returns "mile"
Parameters:
beginIndex - the beginning index, inclusive.
endIndex - the ending index, exclusive. 
Returns:
the specified substring. 
Throws: 
IndexOutOfBoundsException - if the beginIndex is negative, 
or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.
*/