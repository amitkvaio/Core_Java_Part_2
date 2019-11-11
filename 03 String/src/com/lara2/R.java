package com.lara2;

public class R
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "ABC";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
/*
Open Declaration boolean java.lang.String.equals(Object anObject)
equals
public boolean equals(Object anObject)
Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
Overrides: 
equals in class Object 
Returns:
true if the given object represents a String equivalent to this string, false otherwise
*/
/*
 
 
 Open Declaration boolean java.lang.String.equalsIgnoreCase(String anotherString)

equalsIgnoreCase
public boolean equalsIgnoreCase(String anotherString)
Compares this String to another String, ignoring case considerations. 
Two strings are considered equal ignoring case if they are of the same length and
 corresponding characters in the two strings are equal ignoring case. 
Two characters c1 and c2 are considered the same ignoring case if at least one of 
the following is true: 

The two characters are the same (as compared by the == operator) 
Applying the method Character.toUpperCase(char) to each character produces the same result 
Applying the method Character.toLowerCase(char) to each character produces the same result 
Parameters:
anotherString - The String to compare this String against 
Returns:
true if the argument is not null and it represents an equivalent String ignoring case; 
false otherwise
*/
