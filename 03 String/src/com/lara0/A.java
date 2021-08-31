package com.lara0;

public class A {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "123";
		String s3 = "JAVA";
	}
}

//https://javaconceptoftheday.com/how-the-strings-are-stored-in-the-memory/
/*

String represents sequence of characters enclosed within the double quotes.  “abc”, “JAVA”, “123”, “A” are some examples of strings. 
In many languages, strings are treated as character arrays. 

But In java, strings are treated as objects. To create and manipulate the strings, Java provides three classes.


1) java.lang.String                     (From JDK 1.0)

2) java.lang.StringBuffer            (From JDK 1.5)

3) java.lang.StringBuilder           (From JDK 1.5)

Let’s discuss some introductory points about these three classes.

1) All these three classes are members of java.lang package and they are final classes. 

	That means we can’t create subclasses to these three classes.

2) All three classes implement Serializable and CharSequence interface.

3) java.lang.String objects are immutable in java. That is, once we create String objects, we can’t modify them. 
	Whenever we try to modify the existing String object, a new String object is created with modifications. 
	Existing object is not at all altered. Where as java.lang.StringBuffer and java.lang.StringBuilder objects are mutable. 
	That means, we can perform modifications to existing objects.

4) Only String and StringBuffer objects are thread safe. StringBuilder objects are not thread safe. 
	So whenever we want immutable and thread safe string objects, use java.lang.String class and 
	whenever we want mutable as well as thread safe string objects then use java.lang.StringBuffer class.

5) In all three classes, toString() method is overrided. So. whenever we use reference variables of these three types, 
	they will return contents of the objects not physical address of the objects.

6) hashCode() and equals() methods are overrided only in java.lang.String class 
	but not in java.lang.StringBuffer and java.lang.StringBuilder classes.

7) There is no reverse() and delete() methods in String class. But, StringBuffer and StringBuilder have reverse() and delete() methods.

8) In case of String class, we can create the objects without new operator. 
	But in case of StringBuffer and StringBuilder class, we have to use new operator to create the objects.

*/