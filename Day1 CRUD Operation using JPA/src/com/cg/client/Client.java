package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		//Lazy Initialization
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		/*  //create operation
		emp.setID(101);
		emp.setName("Ashlesha");
		service.addEmployee(emp);   */
		
		/*//retirve a data
		emp=service.getEmployeeByID(102);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp Name: "+emp.getName()); */
		
		/*//update a data
		emp=service.getEmployeeByID(102);
		emp.setName("Ashlesha");
		service.updateEmployee(emp);*/
		
		//retirve a data
		emp=service.getEmployeeByID(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp Name: "+emp.getName()); 
		
		//delete a data
		emp=service.getEmployeeByID(101);
		service.removeEmployee(emp);
		

	}

}
