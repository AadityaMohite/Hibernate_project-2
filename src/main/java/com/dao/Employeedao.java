package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.Employee;




public class Employeedao{
	
	
	
	SessionFactory sessionFactory = HibernateConfig.getseesionfactory();
	
	public String Saveemployee(Employee emp) {
		
		
		Session ss = sessionFactory.openSession();
		
		
	Transaction transaction =	ss.beginTransaction();
	
	ss.save(emp);
	
	transaction.commit();
		
		
		ss.close();
		
		return "Employee Save Sucessfully";
		
		
		
		
		
	}
	
	
	public List<Employee> Displayemployee() {
		
		Session ss = sessionFactory.openSession();
		
	   List<Employee>	emplist =  ss.createQuery("from Employee").list();
	   
	   if(emplist.isEmpty()) {
		   throw new EmployeeNotFound("Employee not found ");
	   }
	   
	   
	   return emplist;
		
		
	}
	
	public String Updateemployee(Employee emp) {
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		    Employee existingEmployee = session.get(Employee.class, emp.getId());
		    
		    
		    if(existingEmployee==null) {
		    	session.close();
		    	throw new EmployeeNotFound("Employee Details not found");
		    	
		    }else {
		      existingEmployee.setName(emp.getName());
		      existingEmployee.setAddress(emp.getAddress());
              existingEmployee.setDepartment(emp.getDepartment());
              existingEmployee.setSalary(emp.getSalary());
		    }
              
              
              
              
              
              tr.commit();
              session.close();
              
              return "Update Employee Details Sucessfully";
		
		
	}
	
	
	public String Deletemployee(int id) {
		
		Session session = sessionFactory.openSession();
		
	   Transaction tr = session.beginTransaction();
	   
	   
	     Employee existingemployee = session.get(Employee.class, id );
	     
	     if(existingemployee!=null) {
	    	      session.delete(existingemployee);
	    	      tr.commit();
	    	      session.close();
	    	      
	    	      return "Employee details Sucessfully";
	     }else {
	    	 
	    	    throw new EmployeeNotFound("Employee not found to be delete");
	    	 
	     }
		
		
	}
	
	
}