package com.Employeemain;

import java.util.List;
import java.util.Scanner;

import com.controller.Employeecontroller;
import com.dao.EmployeeNotFound;
import com.entity.Employee;
public class EmployeeMain{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Employeecontroller control = new Employeecontroller();
		
		
		while(true){
			
			System.out.println("1.Save Employee Details");
			System.out.println("2.Display Employee Details");
			System.out.println("3.Update Employee Details");
			System.out.println("4.Delete Employee Details");
			System.out.println("5.Exit");
			
			System.out.println("Enter the option: ");
			int option = sc.nextInt();
			
			sc.nextLine();
			
			switch (option) {
			case 1:    System.out.println("Enter the Name of Employee: ");
			           String name = sc.nextLine();
			           
			           System.out.println("Enter the Employee Salary: ");
			           double salary = sc.nextDouble();
			           
			          sc.nextLine();
			           
			           System.out.println("Enter the Employee Address: ");
			           String Address = sc.nextLine();
			           
			           System.out.println("Enter the Employee Department");
			           String dep = sc.nextLine();
			           
			           Employee emp = new Employee(name,salary,Address,dep);
			           
			              String msg = control.Saveemployee(emp);
			              
			              System.out.println(msg);
				
				break;
			case 2:     
				  try {
				List<Employee> employees = control.DisplayEmployee();
				
			
			              for (Employee emp2 : employees) {
								System.out.println("Employee ID: "+emp2.getId());
								System.out.println("Employee Name: "+emp2.getName());
								System.out.println("Employee Address: "+emp2.getAddress());
								System.out.println("Employee Salary: "+emp2.getSalary());
								System.out.println("Employee Department: "+emp2.getDepartment());
								System.out.println("------------------------------------------------");    
					         }
				  }catch(EmployeeNotFound e) {
					  System.out.println(e.getMessage());
				  }
				
				break;
				
				
				
			case 3:     
				         System.out.println("Enter the EMployee ID for Update Details: ");
				         Integer id2 = sc.nextInt();
				
				          sc.nextLine();
				         
				         System.out.println("Enter the New Name of Employee: ");
			             String name2 = sc.nextLine();
			             
			             System.out.println("Enter the New Salary of Employee: ");
			             double salary2 = sc.nextDouble();
			             
			             sc.nextLine();
			             
			             System.out.println("Enter the New Address of Employee: ");
			             String Address2 = sc.nextLine();
			             
			             System.out.println("Enter the New Department of Employee: ");
				          String department = sc.nextLine();
				          
				          
				          
				          
				          Employee employee = new Employee(name2,salary2,Address2,department);
				          employee.setId(id2);
				          String msg2 = control.Updateemployee(employee);
				          System.out.println(msg2);
				          
			    break;
			    
			case 4:     System.out.println("Enter the Employee Id: ");
			            int id = sc.nextInt();
			            
			         String msgString =   control.Deleteemployee(id);
			            System.out.println(msgString);
				break;
			case 5:   System.out.println("Existing...");
			          return;

			default:  System.out.println("Invalid option");
				break;
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}