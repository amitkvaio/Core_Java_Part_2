package com.lara1;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;

public class E
{
	 void test1()//CTS
	 {
		 System.out.println(1);
		 int i=10/0;
		 System.out.println(2);
	 }
	 
/*
	  
IF THE COMPILER IS NOT FORSING US TO KEEP TRY-CATCH THEN IT IS UNCHECKED EXCEPTION

Unchecked Exception:-
The exceptions which are not checked by the compiler at the time of compilation are called unchecked Exception.
ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException….etc
If the application contains un-checked Exception code is compiled but at runtime JVM 
	(Default Exception handler) display exception message then program terminated abnormally.
To overcome runtime problem must handle the exception in two ways.
	By using try-catch blocks.
	By using throws keyword.
Note-1:-
Whether it is a checked Exception or unchecked exception exceptions are raised at runtime but not compile time.
Note 2:-
In java whether it is a checked Exception or unchecked Exception must handle the Exception by 
	using try-catch blocks or throws keyword to get normal termination of application & to execute rest of the application.
Note 3:-
For the checked exception when we write try-catch blocks or throws keyword then only code is compiled but 
	for un-checked exceptions try-catch or throws keyword optional.
 */
	 
	void test2()// optional to keep try-catch compiler will not forcing us
	{
		System.out.println(1);
		try
		{

		} catch (ArithmeticException e)// UNCHECKED EXCEPTION
		{

		}
		System.out.println(2);
	}
	 
	 
	void test3()// NFE , unchecked exception
	{
		System.out.println(1);
		int i = Integer.parseInt("abc");
		System.out.println(2);
	}
	 
	 
	 
	void test4()// unchecked exception
	{
		System.out.println(1);
		try
		{

		} catch (NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(2);
		}
	}
	 
	 void test5()// NPE, UNCHECKED EXCEPTION
	 {
		 System.out.println(1);
		 String s1 = null;
		 s1.length();
		 System.out.println(2);
	 }
	 
	void test6()// unchecked exception
	{
		System.out.println(1);
		try
		{

		} catch (NullPointerException e)
		{
		}
		System.out.println(2);
	}
	 
	 
	 
	 void test7()
	 {
		 Object obj = new Object();
		 E e1= (E)obj;
	 }
	 
	 /*
	 obj is the Object type so we can not cast into E type 
	 so it will produce CLASS CAST EXCEPTION
	 and compiler is not bothering about whether we keep 
	 try-catch or not so it is one of the unchecked exception
	 */
	 
	 void test8()//stack over flow exception , unchecked ex
	 {
		 test8();
	 }
	 
	 
	void test9()// UCHEX
	{
		try
		{

		} catch (StackOverflowError e)
		{
			// TODO: handle exception
		}
	}
	 
	 
	 
	 void test10()//UCHED EX
	 {
		 int x[]=new int[9999999];//out of memory error
	 }
	 
	 
	void test11()
	{
		try
		{

		} catch (NoClassDefFoundError ex)
		{
			System.out.println(ex);
		}
	}
	 
	 void test12()//ClassNotFound exception is one of the checked exception
	 {
		 //Class.forName("");
	 }
/*
here compiler is forcing us to keep try catch so it is checked exception
	 
Checked Exception:-
The Exceptions which are checked by the compiler at the time of compilation is called Checked Exceptions.
Examples:- IOException,SQLException,InterruptedException,ClassNotFoundException……..etc

If the application contains checked Exception the compiler is able to 
	check it and it will give intimation to developer regarding Exception in the form of compilation error.

Handle the checked Exception in two ways
By using try-catch block.
By using throws keyword.

There are two types of predefined methods
Exceptional methods
public static native void sleep(long) throws java.lang.InterruptedException
public boolean createNewFile() throws java.io.IOException
public static Class forName(String str) throws ClassNotFoundException

Normal methods
public long length();
public java.lang.String toString();

In our application whenever we are using exceptional methods the code is not compiled 
	because these methods throws checked exception hence must handle the exception by using try-catch or throws keywords. 
	And no need to remember the methods just use the method compile it then compiler is saying exception information handle it.

Note: - If application contains checked Exception then compile time just compiler 
	is displays exception information for handling but the exception raised at runtime if the required resources are not available.
	  

*/
	 
	 void test13()//CNFE ,checked ex
	 {
		 try
		 {
			 Class.forName("");
		 }
		 catch(ClassNotFoundException ex)
		 {
			 ex.printStackTrace();
		 }
	 }
	 
//	 void test14(),checked ex
//	 {
//		 try
//		 {
//			 Class.forName("");
//		 }
//		 catch(NullPointerException ex)
//		 {
//			 ex.printStackTrace();
//		 }
//	 }
	 
	 
	 /*
	 inside the try block exception occurs of the CNFEXCEPTION 
	 but there is no catch to handle that exception
	 
	 
	 */
//	 void test15()//checked exp
//	 {
//		 try
//		 {
//			 
//		 }
//		 catch(ClassNotFoundException ex)
//		 {
//			 
//		 }
//	 }
	 
	 /*
	  
	  inside try no stmt there, then why we are keeping CNFEXCEPTION with the catch, 
	  compiler, is not finding a single statement inside the try, because try has
	  every knowledge about it
	  
	  */
	 
	 
//	 void test16()//checked ex
//	 {
//		 try
//		 {
//			 System.out.println("done");//this stmt does not required CNFEXCEPTION
//		 }
//		 catch(ClassNotFoundException EX)
//		 {
//			 
//		 }
//	 }
	 
	 void test17()//checked exption
	 {
		 try
		 {
			 Class.forName("");
			 Class.forName("");
			 Class.forName("");
			 Class.forName("");
		 }
		 catch(ClassNotFoundException ex)
		 {
			 
		 }
		 /*
		  HERE 4 times CNFE , no matter how many times occurs only one catch handle cnfe 
		  */
	 }
	 
//	 void test18()//checked exception
//	 {
//		 DriverManager.getConnection("");
//	 }
	 
	 /*
	 it is the sql exception which required try catch with sql exception,
	 because compiler know all the stmt about the sql exception
	 
	 */
	 
	 void test181()//checked exception
	 {
		 try
		 {
			 DriverManager.getConnection("");
		 }
		 catch(SQLException ex)
		 {
			 
		 }
	 }
	 
//	 void test19()//checked ex
//	 {
//		 try
//		 {
//			 
//		 }
//		 catch(SQLException ex)
//		 {
//			 
//		 }
//	 }
//	 
	 
	 /*
	 try have not any stmt which arise sql exception , compiler is looking for one of the 
	 sql stmt , which arise sqlexception . 
	 */
	 
//	 void test20()
//	 {
//		 try
//		 {
//			 Class.forName("");//it required CNFE and we are providing sql exception,
//			 // cte and it is the checked exception
//		 }
//		 catch(SQLException ex)
//		 {
//			 
//		 }
//	 }
	 
	 
	  void test21()//checked exception
	  {
		  try
		  {
			  Class.forName("");
			  DriverManager.getConnection("");
		  }
		  catch(SQLException ex)
		  {
			  
		  }
		  catch(ClassNotFoundException ex)
		  {
			  
		  }
	  }
	  
	  
//	  void test22()//compiler is forcing us to keep try catch, it is the IOexception, and checked exception
//	  {
//		 new FileWriter(""); 
//	  }
	 
	 
	 void test23()//checked exception
	 {
		 try
		 {
			 new FileWriter("");
		 }
		 catch(IOException ex)
		 {
			 
		 }
	 }
	 
//	 void test24()
//	 {
//		 try
//		 {
//		//there is no stmt which require IOException,cte
//		 }
//		 catch(IOException ex)
//		 {
//			 
//		 }
//	 }
	 
	 
//	 void test25()//checked ex
//	 {
//		 clone();//it required CloneNotSupported ex
//	 }
	 
	 void test26()//checked ex
	 {
		 try
		 {
			 clone();
		 }
		 catch(CloneNotSupportedException ex)
		 {
			 
		 }
	 }
	 
//	 void test27()//checked ex
//	 {
//		 try
//		 {
//			//there is no statement which raised the clonenotsupportedexception 
//		 }
//		 catch(CloneNotSupportedException ex)
//		 {
//			 
//		 }
//	 }
	 
	 
//	 void test28()//checked ex
//	 {
//		 Thread.sleep(100);//compiler is forcing us to keep under try catch with InteruptedException
//	 }
	 
	 
	 void test29()//checked ex
	 {
		 try
		 {
			 Thread.sleep(100);
		 }
		 catch(InterruptedException ex)
		 {
			 
		 }
	 }
	 
//	  void test30()//checked ex
//	  {
//		 try
//		 {
//			 //NO stmt to rise InterrutedException , it is looking for stmt which arsie InterruptedException
//		 }
//		 catch(InterruptedException EX)
//		 {
//			 
//		 }
//	  }
	 
	 
//	 void test31()//checked ex
//	 {
//		 DateFormat df = DateFormat.getDateInstance();
//		 df.parse("");
//		 //it required parseException
//	 }
	 
	 void test32()
	 {
		 DateFormat df = DateFormat.getDateInstance();
		 try
		 {
			 df.parse("");
		 }
		 catch(ParseException ex)
		 {
			 ex.printStackTrace();
		 }
	 }
	 
//	 void test33()
//	 {
//		 try
//		 {
//			 
//		 }
//		 catch(ParseException ex)
//		 {
//			 
//		 }
//	 }
	 
	 
}




