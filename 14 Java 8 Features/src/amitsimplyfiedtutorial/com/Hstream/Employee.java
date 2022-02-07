package amitsimplyfiedtutorial.com.Hstream;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String eName;
	int empId;
	double eWeight;
	boolean marriageStatus;
	long salary;

	public Employee(String eName, int empId, double eWeight, boolean marriageStatus, long salary) {
		super();
		this.eName = eName;
		this.empId = empId;
		this.eWeight = eWeight;
		this.marriageStatus = marriageStatus;
		this.salary = salary;
	}
	
	public String geteName() {
		return eName;
	}

	public int getEmpId() {
		return empId;
	}

	public double geteWeight() {
		return eWeight;
	}

	public boolean isMarriageStatus() {
		return marriageStatus;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", empId=" + empId + ", eWeight=" + eWeight + ", marriageStatus="
				+ marriageStatus + ", salary=" + salary + "]";
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		System.out.println("***********compare******12******");
		return e1.geteName().compareTo(e2.geteName());
	}
}
