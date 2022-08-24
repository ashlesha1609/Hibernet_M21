package com.cg.tns.repository;

import com.cg.tns.entities.Admin;

public interface IAdminRepository {
	//step 1
	// use here crud operation method
	//& also we have to use Abstract method
	
	//step 2
	///here we use a method is to add a data
	public Admin addNewAdmin(Admin admin); 
	
	//step 3
		///here we use a method is to update a data
	public Admin updateAdmin(Admin admin);
	
	//here we use a method is to delete a data
	public Admin deleteAdmin(long id);
	
	//now we have to use the transaction method i.e commit transaction & begin transaction
	//here i use ...user define method 
	void beginTransaction();   //begin the operation of Entity manager
	void commitTransaction();  //so here i use to Close an entity manager


}
