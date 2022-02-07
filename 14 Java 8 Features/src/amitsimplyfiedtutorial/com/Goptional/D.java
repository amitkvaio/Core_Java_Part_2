package amitsimplyfiedtutorial.com.Goptional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D {

	public static void main(String[] args) {
		Character c = getNonRepeatedCharacter("SASAS");
		System.out.println("Non repeated character is :" + c.toString());
	}

	// Program to print first non repeated character
	public static Character getNonRepeatedCharacter(String str) {
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() ; i++) {
			Character c = str.charAt(i);
			if (countCharacters.containsKey(c)) {
				countCharacters.put(c, countCharacters.get(c) + 1);
			} else {
				countCharacters.put(c, 1);
			}
		}
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();
		}
		return null;
	}
}

/*
There is no non repeating character for getNonRepeatedCharacter("SASAS") 
Hence it will return null and we are calling c.toString(), 
	so it will obviously throw NullPointerException.
We can use Optional to avoid this NullPointerException.
*/