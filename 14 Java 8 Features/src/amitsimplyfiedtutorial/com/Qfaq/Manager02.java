package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//How to sort Collection in Java 8?
public class Manager02 {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "aa", 11));
		noteLst.add(new Notes(3, "cc", 33));
		noteLst.add(new Notes(4, "bb", 44));
		noteLst.add(new Notes(2, "dd", 34));
		noteLst.add(new Notes(5, "zz", 32));
		
		noteLst.sort((n1,n2)->n1.getId()-n2.getId());
		//noteLst.sort((note1,note2)->note1.getTagName().compareTo(note2.getTagName()));
		noteLst.forEach(note->System.out.println(note));
		System.out.println("-------------------------------");
		
		//Older way to sort, before java 8
		noteLst.sort(new Comparator<Notes>() {
			@Override
			public int compare(Notes n1, Notes n2) {
				return n1.getId() - n2.getId();
			}
		});
		noteLst.forEach(note->System.out.println(note));
	}
	
	
}
