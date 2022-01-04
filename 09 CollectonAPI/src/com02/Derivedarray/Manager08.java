//32 vvi
package com02.Derivedarray;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	int age;
	double weight;

	Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	static class BasedOnName implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.name.compareTo(p2.name);
		}
	}

	static class BasedOnAge implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.age - p2.age;
		}
	}

	static class BasedOnWeight implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return (int) (p1.weight - p2.weight);
		}
	}

}
public class Manager08 {
	public static void main(String[] args){
		Person [] x={
				new Person("raju",21,34.2),
				new Person("ramu",22,33.2),
				new Person("raj",23,32.2),
				new Person("aaju",24,31.2)
		};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.BasedOnName());
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.BasedOnAge());
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.BasedOnWeight());
		System.out.println(Arrays.toString(x));
	}
 }
