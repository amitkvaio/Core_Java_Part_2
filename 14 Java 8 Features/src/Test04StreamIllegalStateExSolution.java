import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 Reuse a stream
 For whatever reason, you really want to reuse a Stream, try the following Supplier solution :
 Each get() will return a new stream.
 */
public class Test04StreamIllegalStateExSolution {
	public static void main(String[] args) {

		String[] array =
		{ "a", "b", "c", "d", "e","b" };

		Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

		// get new stream
		streamSupplier.get().forEach(x -> System.out.println(x));

		// get another new stream
		long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
		System.out.println(count);

	}
}
