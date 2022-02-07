package amitsimplyfiedtutorial.com.Goptional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class E {
	public static void main(String[] args) {
		Optional<Character> opCh = getNonRepeatedCharacter("SASAS");
		if (opCh.isPresent())
			System.out.println("Non repeated character is :" + opCh.toString());
		else {
			System.out.println("No non repeated character found in String");
		}
	}

	// Program to print first non repeated character
	public static Optional<Character> getNonRepeatedCharacter(String str) {
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (countCharacters.containsKey(c)) {
				countCharacters.put(c, countCharacters.get(c) + 1);
			} else {
				countCharacters.put(c, 1);
			}
		}
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return Optional.of(e.getKey());
		}
		return Optional.ofNullable(null);
	}
}
/*
When above method returned Optional, we are already aware that it can return null value too.
We can call Optional’s isPresent method to check if there is any value are there or not.
if values is there then it will return that values else it empty;
*/