package com03.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {
	// Normal variables 
    int i = 10, j = 20; 
  
    // Transient variables 
    transient int k = 30; 
  
    // Use of transient has no impact here 
    transient static int l; 
    transient final int m ; 
    
    public Test() {
		 m=1000;
		 l=888888888;
	}
  
    public static void main(String[] args) throws Exception 
    { 
        Test input = new Test(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        Test output = (Test)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
    } 
}
