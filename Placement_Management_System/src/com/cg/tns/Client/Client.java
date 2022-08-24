package com.cg.tns.Client;

import com.cg.tns.entities.Admin;
import com.cg.tns.service.AdminServiceImp;
import com.cg.tns.service.IAdminService;

public class Client {

	public static void main(String[] args)
	{
		
		Admin a=new Admin();
		a.setId(301);
		a.setName("Ashlesha Hatagle ");
		a.setPassword("7895685");
	    IAdminService ad=new AdminServiceImp();
	    ad.addNewAdmin(a);


	
	    
	}
}