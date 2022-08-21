package com.cg.SingleInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest {
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Ashlesha");
		emp.setSalary(45000);
		em.persist(emp);//to add the row
		
		//create one more Employee
		Employee emp1=new Employee();
		emp1.setName("Shradha");
		emp1.setSalary(35000);
		em.persist(emp1);
		
		//create one Manager
		Manager m=new Manager();
		m.setName("Shivani");
		m.setSalary(25000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the Database");
		em.close();
		factory.close();
		
		
	}

}











