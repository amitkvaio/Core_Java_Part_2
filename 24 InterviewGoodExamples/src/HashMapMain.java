import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Martin", 27);
		Map<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(emp1, "Verified");
		System.out.println("Before: "+emp1);
		emp1.setName("John");
		System.out.println("After : "+emp1);
		System.out.println(hm.get(emp1));
	}
}
/*

Output will be null.
We have implemented Employee’s hashcode and equals method using name and age attributes, 
so when we put emp1 as key in hashmap, it will use hashcode and equals method and 
will be put in HashMap.

After putting emp1 in HashMop, we have changed name of the employee, 
so when we will try to retrieve element from HashMap using hm.get(emp1), 
we won’t be able to get object which we have put earlier and it will return null. 








*/

