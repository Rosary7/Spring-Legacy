package enablement.spring.core.jdbctemplate;

/*
 create table employee(
   id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(30) NOT NULL,
   salary float (6,2)
 );
 
 */
public class EmployeeDetail {
	private int id;
	private String name;
	private float salary;
	
	public EmployeeDetail() {}
	
	public EmployeeDetail(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
