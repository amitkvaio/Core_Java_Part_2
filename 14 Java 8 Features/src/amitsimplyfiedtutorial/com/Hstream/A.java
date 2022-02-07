package amitsimplyfiedtutorial.com.Hstream;

public class A {
	public static void main(String[] args) {
		System.out.println("About Stream [JDK 1.8] -- Read the below comments carefully!!");
	}
}

/*


--	Streams 
 
--	To process objects of the collection,  in 1.8 version Streams concept introduced. 
 
--	What is the differences between java.util.streams and java.io streams? 
 	----------------------------------------------------------------------
--	java.util streams meant for processing objects from the collection. I. e, it represents 
		a stream of objects from the collection.
--	But java.io streams meant for processing binary and character data with respect to file.  
		i.e it represents stream of binary data or character data from the file .hence  
		java.io streams and java.util streams both are different. 

--	What is the difference between collection and stream? 
   	-----------------------------------------------------
   	
--	if we want to represent a group of individual objects as a single entity then  
		we should go for collection. 
--	if we want to process a group of objects from the collection then we should  
		go for streams. 
   
--	we can create a stream object  to the collection by using stream()method of Collection interface. 
--	stream() method is a default method added to the Collection in 1.8 version. 
 
--	default Stream stream() 

Ex: 
Stream s = c.stream(); 
 
Stream is an interface present in java.util.stream.   
once we got the stream, by using that we can process objects of that collection. 
 
we can process the objects in the following two phases 
 
1.configuration 
2.processing 

*/