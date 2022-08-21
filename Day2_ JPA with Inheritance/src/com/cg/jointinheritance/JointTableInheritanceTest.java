package com.cg.jointinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.ClassPertable.EmployeeN;

public class JointTableInheritanceTest {
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		EmployeeK emp4=new EmployeeK();
		emp4.setName("Ashlesha.Hatagle");
		emp4.setSalary(45000);
		em.persist(emp4);//to add the row
		
		//create one more Employee
		EmployeeN emp5=new EmployeeN();
		emp5.setName("Dhiraj.Wagh");
		emp5.setSalary(35000);
		em.persist(emp5);
		
		//create one Manager
		ManagerK m2=new ManagerK();
		m2.setName("Ashi");
		m2.setSalary(25000);
		m2.setDeptName("Finance");
		em.persist(m2);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the Database");
		em.close();
		factory.close();
		
		
	}

}



