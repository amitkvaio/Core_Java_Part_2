//71 - adding and removing object after iteration operation
package com03.Aarraylist;
import java.util.ArrayList;
import java.util.Iterator;

//after finishing the iterator you can add the obj
public class Manager35 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(8);
		list.add(34);
		list.add(6);
		list.add(66);
		list.add(42);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Adding After iteration : " + 786);
		list.add(786);
		System.out.println(list);
		list.remove(new Integer(8));
		System.out.println("Removing After iteration : " + 8);
		System.out.println(list);
	}

}

/*

once the iterator got over then we can add/remove any no of element in the arrays list.
*/