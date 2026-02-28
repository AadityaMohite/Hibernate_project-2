package com.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Employees")
@Data

@NoArgsConstructor
public class Employee{
	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column(name="Employee_Name")
	private String name;
	
	
	@Column(name="Employee_Department")
	private String department;
	
	@Column(name="Employee_Address")
	private String Address;
	
	@Column(name="Employee_Salary")
	private double salary;
	
	
	public Employee(String name,double salary,String Address,String department){
		this.name = name;
		this.salary = salary;
		this.Address = Address;
		this.department = department;
	}
	
	
	
	
	
}