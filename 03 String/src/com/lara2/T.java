package com.lara2;

public class T {
	public static void main(String[] args) {
		String s1 = "abc abc";
		String s2 = s1.replace('c', 'x');
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*

Open Declaration String java.lang.String.replace(char oldChar, char newChar)

replace
public String replace(char oldChar,char newChar)
Returns a new string resulting from replacing all occurrences of oldChar
 in this string with newChar. 
If the character oldChar does not occur in the character sequence represented
 by this String object, then a reference to this String object is returned.
  Otherwise, a new String object is created that represents a character sequence identical
   to the character sequence represented by this String object, except that every occurrence of 
   oldChar is replaced by an occurrence of newChar. 

Examples: 

 "mesquite in your cellar".replace('e', 'o')
         returns "mosquito in your collar"
 "the war of baronets".replace('r', 'y')
         returns "the way of bayonets"
 "sparring with a purple porpoise".replace('p', 't')
         returns "starring with a turtle tortoise"
 "JonL".replace('q', 'x') returns "JonL" (no change)
 
Parameters:
oldChar - the old character.
newChar - the new character. 
Returns:
a string derived from this string by replacing every occurrence of oldChar with newChar.
*/