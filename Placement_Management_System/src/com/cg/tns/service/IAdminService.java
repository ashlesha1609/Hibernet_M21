package com.cg.tns.service;

import com.cg.tns.entities.Admin;

public interface IAdminService 
{
	//step 1
	// use here crud operation method
	//& also we have to use Abstract method
	//step 2
		///here we use a method is to add a data
	Admin addNewAdmin(Admin admin);  //create
	
	//step 3
		///here we use a method is to update a data
	Admin updateAdmin(Admin admin);  //Update
	
	
	//step 4
	//here we use a method is to login & logout the data
	Admin login(Admin admin);   // login
	
	//step 5
	boolean logout();  // logout
	
}
