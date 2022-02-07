package amitsimplyfiedtutorial.com.Hstream;

import java.util.stream.Stream;

//VII.Stream.of()method 
public class M {
	public static void main(String[] args) {
		Stream s=Stream.of(99,999,9999,99999); 
		s.forEach(a->System.out.println(a));
		System.out.println("********************");
		
		Double[] d={10.0,10.1,10.2,10.3}; 
		Stream s1=Stream.of(d); 
		s1.forEach(System.out :: println); 
	}
}

/*

we can also apply a stream for group of values and for arrays.
Ex: 
Stream s=Stream.of(99,999,9999,99999); 
s.forEach(System.out:: println); 

*/