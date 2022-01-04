//Stack - LIFO - last in first out
package com09.deloping.own.ClassDevlopement;

public class StackDevelop {
	private Object elements[];
	private int capacity;
	private int size;

	public StackDevelop() {
		capacity = 10; // StackDevelop default values is 10
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

	public Object process() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("No Elements are available:");
		}
		Object obj = elements[--size];
		elements[size] = null;
		return obj;

	}

	public Object[] toArray() {
		Object temp[] = new Object[size];
		for (int i = 0; i < size; i++) {
			temp[i] = elements[i];
		}
		return temp;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(" ");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i] + ",");
		}
		String str = "[" + sb.substring(0, sb.length() - 1) + "]";
		return str;
	}

	public int capacity() {
		return capacity;
	}
}
