package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
	private static EntityManagerFactory factory;
	private static EntityManager em;
	//static block
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
	}

	public static EntityManager getEntityManager1() {
		// TODO Auto-generated method stub
		return null;
	}

		
	

}
