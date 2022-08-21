package com.cg.ClassPertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ClassPerTableTest {
		public static void main(String[] args) 
		{
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			
			//create one Employee
			EmployeeN emp2=new EmployeeN();
			emp2.setName("Ashlesha.H");
			emp2.setSalary(45000);
			em.persist(emp2);//to add the row
			
			//create one more Employee
			EmployeeN emp3=new EmployeeN();
			emp3.setName("Shradha.A");
			emp3.setSalary(35000);
			em.persist(emp3);
			
			//create one Manager
			ManagerN m1=new ManagerN();
			m1.setName("Shivani.N");
			m1.setSalary(25000);
			m1.setDeptName("Finance");
			em.persist(m1);
			
			em.getTransaction().commit();
			System.out.println("The data is added successfully in the Database");
			em.close();
			factory.close();
			
			
		}

	}



