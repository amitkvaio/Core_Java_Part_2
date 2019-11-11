package com.clone.deepCopy;

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
    	Student st = (Student)super.clone();
    	st.course = (Course)course.clone();
    	return st;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
