package amitsimplyfiedtutorial.com.Alambda;

public class Developer {
	private String name;
	private int age;
	private int salary;

	public Developer(String name, int salary, int age) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
