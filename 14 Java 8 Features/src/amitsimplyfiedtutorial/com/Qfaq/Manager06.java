package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//How to convert a list of objects to a Map in Java 8 by handling duplicate keys?
public class Manager06 {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));
//use third mergeFunction argument (oldValue, newValue) -> oldValue solved the duplicated key issue by considering old value
		Map<String, Long> notesRecords = noteLst.stream()
				.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (old, newV) -> newV));
		System.out.println(notesRecords);
	}
}
/*
Output - for (oldValue, newValue) -> oldValue, it took old value note4=44
Notes : {note1=11, note2=22, note3=33, note4=44, note5=55}

Output - for (oldValue, newValue) -> newValue, it took new value note4=66
Notes : {note1=11, note2=22, note3=33, note4=66, note5=55}
*/