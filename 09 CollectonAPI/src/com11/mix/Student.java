package com11.mix;

public class Student {
	String name;
	int id;

	public Student(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		int result = 17;
		System.out.println("from hash code");
		result = 31 * result + name.hashCode();
		result = 31 * result + String.valueOf(id).hashCode();
		return result;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}
