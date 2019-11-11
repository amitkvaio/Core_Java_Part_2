package com.clone.shallowCopy;

public class Student implements Cloneable {
	int id;	 
    String name; 
    Course course;
 
    public Student(int id, String name, Course course)
    {
        this.id = id; 
        this.name = name; 
        this.course = course;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
