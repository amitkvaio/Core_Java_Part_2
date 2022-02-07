package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

//Write a function to find length of given input string. 
public class B {
	public static void main(String[] args) {
		Function<String, Integer> fun = (str) -> str.length();
		System.out.println(fun.apply("amit"));
		System.out.println(fun.apply("rajaamit"));
	}
}
/*
Function is a functional interface and hence it can refer lambda expression. 


Difference between predicate and function
=================================================== 
 
Predicate
------------ 
1.	To implement conditional checks We should go for predicate. 
2. 	Predicate can take one type Parameter which represents Input argument type.Predicate<T> 
3.	Predicate interface defines only one method called test()   
4.	public boolean test(T t) 
5.	Predicate can return only boolean value. 

  
 Function 
 ---------
1.	To perform certain operation And to return so result we Should go for function. 
2.  Function can take 2 type Parameters.first one represent Input argument type and Second on represent return Type.  
	Function<T,R> 
3.	Function interface defines only one Method called apply(). 
4. 	public  R  apply(T t) 
5. 	Function can return any type of value 
 
*/