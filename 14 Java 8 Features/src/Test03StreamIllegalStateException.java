import java.util.Arrays;
import java.util.stream.Stream;

/*
	In Java 8, Stream cannot be reused, once it is consumed or used, the stream will be closed.

 */
public class Test03StreamIllegalStateException {
	public static void main(String[] args) {

		String[] array =
		{ "a", "b", "c", "d", "e" };
		Stream<String> stream = Arrays.stream(array);

		// loop a stream
		stream.forEach(x -> System.out.println(x));

		// reuse it to filter again! throws IllegalStateException
		long count = stream.filter(x -> "b".equals(x)).count();
		System.out.println(count);

	}
}
/*
OUTPUT
------
a
b
c
d
e
Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.util.stream.AbstractPipeline.<init>(Unknown Source)
	at java.util.stream.ReferencePipeline.<init>(Unknown Source)
	at java.util.stream.ReferencePipeline$StatelessOp.<init>(Unknown Source)
	at java.util.stream.ReferencePipeline$2.<init>(Unknown Source)
	at java.util.stream.ReferencePipeline.filter(Unknown Source)
	at Test03StreamIllegalStateException.main(Test03StreamIllegalStateException.java:19)
*/