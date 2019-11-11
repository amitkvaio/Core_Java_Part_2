//Passing data {ArrayList to Vector} & Vector to ArrayList:-
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Practise02
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("Sravya");
		a1.add("yadhu");
		//ArrayList - Vector
		Vector<String> v = new Vector<String>(a1);
		v.add("xxx");
		v.add("yyy");
		System.out.println(v); //[ratan, anu, Sravya, yadhu, xxx, yyy]
		
		//Vector-ArrayList
		ArrayList<String> a2 = new ArrayList<String>(v);
		a2.add("suneel");
		System.out.println(a2); //[ratan, anu, Sravya, yadhu, xxx, yyy, suneel]
	}
}
