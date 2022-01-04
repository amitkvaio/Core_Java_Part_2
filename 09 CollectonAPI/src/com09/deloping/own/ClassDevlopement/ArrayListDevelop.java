//125
package com09.deloping.own.ClassDevlopement;

public class ArrayListDevelop {
	private Object elements[];
	private int capacity;
	private int size;

	public ArrayListDevelop() {
		capacity = 10; // ArrayList default values is 10
		elements = new Object[capacity];
	}

	public void add(Object obj) {
		if (capacity == size) {
			alterCapacity();
		} else {
			elements[size++] = obj;
		}
	}

	private void alterCapacity() {
		capacity = capacity * 2;
		Object[] temp = elements;
		elements = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index values should be in between 0 to " + (size - 1));
		} else {
			return elements[index];
		}
	}

	public Object[] toArray() {
		Object temp[] = new Object[size];
		for (int i = 0; i < size; i++) {
			temp[i] = elements[i];
		}
		return temp;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i] + ",");
		}
		String str = sb.substring(0, sb.length() - 1) + "]";
		return str;
	}

	public int capactiy() {
		return capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
