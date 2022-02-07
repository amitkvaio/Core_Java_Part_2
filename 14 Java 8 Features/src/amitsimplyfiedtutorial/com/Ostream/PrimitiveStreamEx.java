package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamEx {
	public static void main(String[] args) {
		IntStream inStrm = IntStream.of(10, 20, 30, 40);
        System.out.println("----- IntStream -----");
        inStrm.forEach(System.out::println);
 
        double[] results = {98.12, 72.17, 75.20, 68.6};
        DoubleStream resultStream = Arrays.stream(results);
        System.out.println("----- DoubleStream -----");
        resultStream.forEach(System.out::println);
        
        long[] longArray = {102365,6598,7896,10032};
        LongStream longStream = LongStream.of(longArray);
        System.out.println("-----LongStream---------");
        longStream.forEach(lon->System.out.println(lon));
	}
}

/*

In java collection framework works with objects, not with primitive types. 
	In order to use primitive with collections, we need to depend on wrapper classes. 
	In Java 8 Stream, we don't need to worry about handling primitive data. 
	Java 8 Stream API provides below Interfaces to support primitive type in Stream.

IntStream is a sequence of primitive int-valued elements 
	supporting sequential and parallel aggregate operations. 
	This is the int primitive specialization of Stream.

LongStream is a sequence of primitive long-valued elements supporting sequential 
	and parallel aggregate operations. This is the long primitive specialization of Stream.

DoubleStream is a sequence of primitive double-valued elements supporting sequential 
	and parallel aggregate operations. This is the double primitive specialization of Stream.

*/