package com.cg.tns.repository;           //in repository package we have creat two classes & one interface   

import javax.persistence.EntityManager;

import com.cg.tns.entities.Admin;

public class AdminRepositoryImp  implements IAdminRepository{
	
	//step 3
	//we have to create entity manager method
    private EntityManager entityManager;
	
    //steps 2
	//we have to create here Constructor so here i use JPAUtil . get entity manager
	public AdminRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	//step 1
	//we have to add here implementing method
	//we are using this user defined method to create any rows, to update the rows, to delete a data,to start our entity manager that all things
	//i.e add,update,delete,commit and begin
	@Override
	public Admin addNewAdmin(Admin admin) {
		entityManager.persist(admin);

		return admin;
	}
    
	
	//step 4
	//for update we have to use the merge entity manager method 
	@Override
	public Admin updateAdmin(Admin admin) {
		entityManager.merge(admin);
		return admin;
	}

	//step 5
	//here we  use remove method & pass the object name of your class 
	@Override
	public Admin deleteAdmin(long id) {
		entityManager.remove(id);
        return null;
	}

	//step 6
	//here we have to use transaction method to start and close the entity manager
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	//
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
