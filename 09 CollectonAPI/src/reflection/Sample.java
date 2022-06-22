package reflection;

public class Sample {

}

class Test {
	public static void main(String args[]) throws Exception {
		Class c = Class.forName("reflection.Sample");
		String s1 = c.getName();
		System.out.println(c);
	}
}
/*
for every class there is a java.lang.Class object . this is a static
class. it is created only once

whenever a class is loaded to the memory all static members loaded to the memory at that 
time itself one object is created i.e Class object which is develop by the sun people , 
and it is created in storing in the static memory of class A.


How to get the object of Class class?

There are 3 ways to get the instance of Class class. They are as follows:

  1.  forName() method of Class class
   2. getClass() method of Object class
   3. the .class syntax

1) forName() method of Class class

    is used to load the class dynamically.
    returns the instance of Class class.
    It should be used if you know the fully qualified name of class.This cannot be used for primitive types.


1) public String getName()	returns the class name

*/