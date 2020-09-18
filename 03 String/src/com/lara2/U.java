package com.lara2;

public class U {
	public static void main(String[] args) {
		String s1 = "abc xyz hello abc";
		String s2 = s1.replaceAll("abc", "test");
		String s3 = "String_Java Constructor";
		String s4 = s3.replaceAll("[\\_' ']", "-");//Replacing underscore and blank space with -
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
	}

}
/*
Open Declaration String java.lang.String.replaceAll(String regex, String replacement)



replaceAll
public String replaceAll(String regex, String replacement)
Replaces each substring of this string that matches the given regular expression with the 
given replacement. 
An invocation of this method of the form str.replaceAll(regex, repl) yields exactly 
the same result as the expression 

Pattern.compile(regex).matcher(str).replaceAll(repl)
Note that backslashes (\) and dollar signs ($) in the replacement string may cause 
the results to be different than if it were being treated as a literal replacement string; 
see Matcher.replaceAll. Use Matcher.quoteReplacement(java.lang.String) to suppress the special
 meaning of these characters, if desired.

Parameters:
regex - the regular expression to which this string is to be matched
replacement - the string to be substituted for each match 
Returns:
The resulting String 
Throws: 
PatternSyntaxException - if the regular expression's syntax is invalid
*/
