import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Generic Dynamic sorting based on the input field VVI
*/

public class EmpGenericSorting {
	private String firstName;
	private String lastName;
	private int age;
	private int mobileNumber;
	private int pin;
	private int std;

	public static <Type> void sortElements(List<Type> resultList, final String fieldName, final boolean isDesc)
			throws Exception {
		Collections.sort(resultList, new Comparator<Type>() {
			@Override
			public int compare(Type o1, Type o2) {
				return compareValue(o1, o2);
			}

			private int compareValue(Type o1, Type o2) {
				int returnValue = 0;
				try {
					Field field = o1.getClass().getDeclaredField(fieldName);
					boolean accessible = field.isAccessible();
					field.setAccessible(true);
					Object objectO1 = field.get(o1);
					Object objectO2 = field.get(o2);
					if (objectO1 instanceof Number) {
						if ((objectO1 != null && objectO2 != null) && (objectO1 instanceof Integer
								|| objectO1 instanceof Long || objectO1 instanceof Byte)) {
							returnValue = Long.valueOf(objectO1 + "").compareTo(Long.valueOf(objectO2 + ""));
						} else if ((objectO1 != null && objectO2 != null)
								&& (objectO1 instanceof Double || objectO1 instanceof Float)) {
							returnValue = Double.valueOf(objectO1 + "").compareTo(Double.valueOf(objectO2 + ""));
						}
					} else if (objectO1 instanceof String || objectO1 instanceof Character) {
						if ((objectO1 != null) && objectO2 != null) {
							returnValue = String.valueOf(objectO1).compareToIgnoreCase(String.valueOf(objectO2));
						}
					}
					field.setAccessible(accessible);
				} catch (Exception e) {
					System.out.println("Error occured while sorting elements");
				}

				if (isDesc) {
					if (returnValue > 0) {
						return -1;
					} else if (returnValue < 0) {
						return 1;
					}
				}
				return returnValue;
			}
		});
	}

	public EmpGenericSorting() {
	}

	public EmpGenericSorting(String firstName, String lastName, int age, int mobileNumber, int pin, int std) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.pin = pin;
		this.std = std;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobileNumber="
				+ mobileNumber + ", pin=" + pin + ", std=" + std + "]";
	}

	public static void main(String[] args) {
		List<EmpGenericSorting> employeeList = getEmployeeList();
		try {
			EmpGenericSorting.sortElements(employeeList, "std", false);
			employeeList.stream().forEach(emp -> System.out.println(emp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<EmpGenericSorting> getEmployeeList() {
		ArrayList<EmpGenericSorting> arList = new ArrayList<>();
		arList.add(new EmpGenericSorting("Amit", "Kumar", 32, 88849, 834001, 15));
		arList.add(new EmpGenericSorting("Sonu", "Trikey", 35, 12345, 834021, 10));
		arList.add(new EmpGenericSorting("Niraj", "Sharma", 31, 88890, 834003, 12));
		arList.add(new EmpGenericSorting("Mukesh", "show", 25, 88888, 834004, 13));
		arList.add(new EmpGenericSorting("Sony", "Roxy", 28, 88854, 834006, 14));
		return arList;
	}
}
