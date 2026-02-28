package com.controller;

import java.io.DataOutput;
import java.util.List;

import com.entity.Employee;
import com.service.Employeeservice;

public class Employeecontroller{
	
	Employeeservice service = new Employeeservice();
	
	
	public String Saveemployee(Employee emp){
		
		String msg = service.Saveemployee(emp);
		
		return msg;
		
		
	}
	
	public List<Employee> DisplayEmployee() {
		
		List<Employee> employees = service.DisplayEmployees();
		
		return employees;
		
		
	}
	 public String Updateemployee(Employee emp) {
		 
		 String msg = service.Updateemployee(emp);
		 
		 return msg;
	 }
	 
	 public String Deleteemployee(int id) {
		String msg =  service.deleteEmployee(id);
		return msg;
	 }
	
	
}