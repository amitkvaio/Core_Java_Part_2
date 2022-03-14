package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Q: How to convert a List of objects into a Map by considering duplicated 
//keys and store them in sorted order?
public class Manager07 {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));
		
		Map<String, Long> noteListMap=
		noteLst.stream()
		.sorted(Comparator.comparingLong(Notes::getTagId).reversed())
		.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldV,newV)->oldV,
				LinkedHashMap::new));
		System.out.println(noteListMap);
		
	}
}
/*
Output - for (oldValue, newValue) -> oldValue, it took old value note4=44
Notes : {note5=55, note4=44, note3=33, note2=22, note1=11}
*/
