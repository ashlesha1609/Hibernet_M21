package com.cg.tns.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	//step 1
    //we have to use here object with two classes as factory & entitymanager
	private static  EntityManagerFactory factory;
	private static  EntityManager entityManager;
	
	//Step 2
	//here i use the Static Block now i use here persistance class bcoz i use java persistance 
	//inside the persistance class we have a method i.e create entity manager factory
	//if we want to access any crud operation methods that crud operation is inside entity manager
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU"); // here i passing the persistance unit which is jpa-pu
	}
	
	//step3 
	//entity manager is a method that is i use here
	//& we have create the object for entity manager i.e //in ln 30
	public static EntityManager getEntityManager()
	{
		if(entityManager==null || !entityManager.isOpen())
		{
			entityManager=factory.createEntityManager();
		}
		return entityManager;
		
	}
}
