package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	//by default all the method are abstract in the interface
		void addEmployee(Employee emp);//creation
		void updateEmployee(Employee emp);//updation
		Employee getEmployeeByID(int ID);//retrieve
		void removeEmployee(Employee emp);//delete
		
}
