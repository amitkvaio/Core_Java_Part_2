package com.lara2;

public class M {
	public static void main(String[] args) {
		String s1 = "abc;xyz;hello;123";
		String[] x = s1.split(";");
		for (String str : x) {
			System.out.println(str);
		}
	}
}
/*



split
public String[] split(String regex)
Splits this string around matches of the given regular expression. 
This method works as if by invoking the two-argument split method with the given expression 
and a limit argument of zero. Trailing empty strings are therefore not included in the
resulting array. 

The string "boo:and:foo", for example, yields the following results with these expressions: 

Regex Result 
: { "boo", "and", "foo" } 
o { "b", "", ":and:f" } 

Parameters:
regex - the delimiting regular expression 
Returns:
the array of strings computed by splitting this string around matches of 
the given regular expression 
Throws: 
PatternSyntaxException - if the regular expression's syntax is invalid
*/
