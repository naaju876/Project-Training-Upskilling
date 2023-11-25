package com.example.StudentResults.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 

@Document(collection="details")
public class Student {
	
	@Id
	private int id;
    private String name;
    private String address;
    private double salary;
    
    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
    
	public int getStudentName() {
		// TODO Auto-generated method stub
		return 0;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Student(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	

}

