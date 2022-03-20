package com03.lara;

import java.io.IOException;
import java.io.Serializable;

class MM implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1363762931313475041L;
	int i;
	String name;
	int age;
	public MM(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}
	@Override
	public String toString() {
		return "MM [i=" + i + ", name=" + name + "]";
	}
	

}
public class Manager17 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//MM mm =  new MM(101, "Amit");
		//Util.serialize(mm, "mm.txt");
		//System.out.println("Serialization has done!!");
		//Before deserilization add //un comments line 12.
		MM n2 = (MM) Util.deSerialize("mm.txt");
		System.out.println(n2.i);
		System.out.println(n2.name);
		System.out.println(n2.age);
		System.out.println("----");
	}
}
