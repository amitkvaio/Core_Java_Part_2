package com.lara2;

public class S {
	public static void main(String[] args) {
		String s1 = "hello to all";
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.startsWith("all"));
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.endsWith("all"));
	}
}
/*
Open Declaration boolean java.lang.String.startsWith(String prefix)

startsWith
public boolean startsWith(String prefix)
	Tests if this string starts with the specified prefix.
Parameters:
prefix - the prefix. 
Returns:
true if the character sequence represented by the argument is a prefix of the character 
sequence represented by this string; false otherwise. Note also that true will be returned
 if the argument is an empty string or is equal to this String object as determined by the 
 equals(Object) method.
 */
