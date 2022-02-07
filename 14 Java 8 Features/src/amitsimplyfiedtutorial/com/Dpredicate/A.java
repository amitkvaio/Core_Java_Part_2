package amitsimplyfiedtutorial.com.Dpredicate;

public interface A {

}

interface Predicate<T> { 
    public boolean test(T t); 
} 

/*

Predicates 
 
--	A predicate is a function with a single argument and returns  boolean value. 
--	To implement predicate functions in java,oracle people introduced Predicate interface in 1.8 
		version(i.e.,Predicate<T>). 

--	Predicate interface present in java.util.function package. 
--	It’s a functional interface and it contains only one method i.e., test() 
-- 	As predicate is a functional interface and hence it can refers lambda expression 
*/