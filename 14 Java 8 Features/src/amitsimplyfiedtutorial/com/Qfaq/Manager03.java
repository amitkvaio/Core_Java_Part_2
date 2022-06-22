package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;
//How to use map to convert object into Uppercase in Java 8?
public class Manager03 {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "aa", 11));
		noteLst.add(new Notes(3, "cc", 33));
		noteLst.add(new Notes(4, "bb", 44));
		noteLst.add(new Notes(2, "dd", 34));
		noteLst.add(new Notes(5, "zz", 32));

		noteLst.stream()
		.map(note -> note.getTagName().toUpperCase())
		.forEach(note -> System.out.println(note));
	}
}
