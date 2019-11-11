import java.util.ArrayList;
import java.util.Hashtable;
//Finding the index values.
public class HashMapIndex {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Hashtable<Integer, Integer> map = new Hashtable<>();
		int hashCode=0;
		for (int i = 0; i < 16; i++) {
			hashCode=Integer.valueOf(i).hashCode();
			int index = hashCode & 15;
			System.out.println("HashCode:"+hashCode +" Index:"+index);
			list.add(index);
			map.put(index, i);
		}
		System.out.println(list);
		System.out.println(map);
	}
}
