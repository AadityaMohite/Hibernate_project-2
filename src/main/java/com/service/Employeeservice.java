package com.service;

import java.util.List;

import com.dao.Employeedao;
import com.entity.Employee;

public class Employeeservice{
	
	Employeedao dao = new Employeedao();
	
	
	public String Saveemployee(Employee emp) {
		
		   String msgString = dao.Saveemployee(emp);
		   
		   return msgString;
		   
		   
		   
		   
		
	}
	
	public List<Employee> DisplayEmployees(){
		
		List<Employee> employees  = dao.Displayemployee();
		
		return employees;
		
	}
	
	public  String Updateemployee(Employee emp) {
		
		String msg = dao.Updateemployee(emp);
		return msg;
	}
	
	public String deleteEmployee(int id) {
		
		
	String msg = dao.Deletemployee(id);
		
		
		return msg;
	}
	
	
	
	
}