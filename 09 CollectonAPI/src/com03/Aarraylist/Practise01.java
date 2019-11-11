//Copying data from Vector to ArrayList:-
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Practise01
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		
		Vector<String> v = new Vector<String>();
		v.add("ten");
		v.add("twenty");
	//	v.add("thirty");
		
		//copy data from vector to ArrayList
		
		Collections.copy(al,v);
		System.out.println(al);
	}
}
/*
To copy data from one class to another class use copy() method of Collections class.

-- The copy() method of java.util.Collections class is used to copy all of the elements from one list into another.

-- After the operation, the index of each copied element in the destination list will be identical to 
	its index in the source list. The destination list must be at least as long as the source list. 
		If it is longer, the remaining elements in the destination list are unaffected.

This method runs in linear time.

Syntax:

public static void copy(List dest, List src)

Parameters: This method takes the following argument as a parameter

    dest – The destination list.
    src – The source list.

	Exception: This method throws IndexOutOfBoundsException, if the destination list is too small to 
	contain the entire source List.
*/