package amitsimplyfiedtutorial.com.Ostream;

public class Employee {
    private Integer id;
    private String fname;
    private String lname;
   
    public Employee(Integer id, String fname, String lname) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

	public Integer getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ "]";
		
	}
}
