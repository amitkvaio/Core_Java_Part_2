import java.util.HashMap;

public class HashMapA {
	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<Student, String>();
		Student s1 = new Student(1, "Amit");
		map.put(s1, "first");
		System.out.println(map);
		
		System.out.println("Updating student s1");
		s1.setName("Kumar");
		System.out.println(map);
		
		System.out.println("Adding new student object to map with same content");
		Student s2 = new Student(1, "Amit");
		map.put(s2, "second");
		System.out.println(map);
		 
	}
}

/*
{Student [id=1, name=Amit]=first}
Updating student s1
{Student [id=1, name=Kumar]=first}
Adding new student object to map with same content
{Student [id=1, name=Amit]=second, Student [id=1, name=Kumar]=first}
Since student class does not implements comparable interface due to that hashmap not able to 
distinguise the duplicate object that is why getting same two object with different value.
*/
class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
