package com.cg.tns.service;

import java.util.Scanner;

import com.cg.tns.entities.Admin;
import com.cg.tns.repository.AdminRepositoryImp;

public class AdminServiceImp implements IAdminService
{
	//Step1:
	//here we have to create object & i use object name as a uao  
	//Establishing connection between service and repository
	private AdminRepositoryImp uao;
	
	Scanner s=new Scanner(System.in);
		
	
	//Step 2
    //we have to create here one Constructor 
	public AdminServiceImp() {
		uao=new AdminRepositoryImp();
	}
    
	//	Service calls to perform CRUD Operation
    //step 3
    //at ln: 29 for addAdmin, we have to first use begin the transaction method
    //at ln:31 i use here addNewAdmin and after that i use commit transaction method
	@Override
	public Admin addNewAdmin(Admin admin) {
		uao.beginTransaction(); //so here we have to first use begin the transaction method
		uao.addNewAdmin(admin);  // i use here addNewAdmin and after that i use commit transaction method
		uao.commitTransaction();
		return admin;
	}

	//step 4
	//at ln:40 for update same we have to use begin the transaction method
	//at ln:41 i use here updatewAdmin and after that i use commit transaction method
	@Override
	public Admin updateAdmin(Admin admin) {
		uao.beginTransaction();
		uao.updateAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	
	//step 5
	//at ln:53 for login part we have to print enter the admin name & password 
	//at ln: 62 & if else we have to print invalid admin name or password i.e line no 62
	@Override
	public Admin login(Admin admin) {
		System.out.println("Enetr the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
	}
	
	else {
		System.out.println("Invalid admin name or password :");
		return null;
	}
	}
	@Override
	public boolean logout() {
		System.exit(0);
		return true;
	}

}
