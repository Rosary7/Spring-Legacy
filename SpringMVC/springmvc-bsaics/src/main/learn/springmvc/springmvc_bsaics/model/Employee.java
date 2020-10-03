package learn.springmvc.springmvc_bsaics.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	
	@Size(min=1,message="name is required")  
	private String name;  
	
	@Min(value=18 , message="Minimum age is 18")
	private int age;
	
	@NotNull(message="required")
	private String address;
	
    @Size(min=3,max =5, message="password is required")  
    private String pass;  
      
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
	public String getPass() {  
        return pass;  
    }  
    public void setPass(String pass) {  
        this.pass = pass;  
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}     
    
}
