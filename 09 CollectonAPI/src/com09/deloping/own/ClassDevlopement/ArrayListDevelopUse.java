package com09.deloping.own.ClassDevlopement;

import java.util.Arrays;

public class ArrayListDevelopUse {
	public static void main(String[] args) {
		ArrayListDevelop arrlist = new ArrayListDevelop();
		System.out.println("Capacity : " + arrlist.capactiy());

		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		arrlist.add(60);
		arrlist.add(70);
		arrlist.add(80);
		arrlist.add(90);
		arrlist.add(100);
		arrlist.add(110);
		System.out.println("Array Size : " + arrlist.size());
		System.out.println("List : " + arrlist);

		Object[] objArra = arrlist.toArray();
		System.out.println("ObjArrays : " + Arrays.toString(objArra));
		System.out.println("Capacity : " + arrlist.capactiy());

		System.out.println("---------------");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

	}
}
