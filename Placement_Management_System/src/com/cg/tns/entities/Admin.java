package com.cg.tns.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.usertype.UserType;


//Step 2: as we know that admin is  nothing but the entity so admin is class & class is nothing  but the entity so we have to go with the annotation @ entity
//so annotation @ entity define this is class
@Entity 

//Step 6 
//we have to required one more annotation that is @table and inside that i passed the table name 
@Table(name="Admin")

//Step 3
//here we use the concept of serialization ,so serializable is a interface
public class Admin implements Serializable
{
	//step 4
	// whenever we use the serializable we have to use this line i.e serialization concept 
	private static final long serialVersionUID=1l;
	
	//step5
	//we provided to this id as primary key in our database,so for that we have to use annotation @id 
	@Id
	
	
	//Step 1
	//we have created the three coloumn here i.e for id,name,password
	//we have to use here private access specifire bcoz if any varisbles an methods declare as a private
	//so if you want to access any another class then we have to go with the getters and setters method
	//so i use here getters and setters method
	private long id;
	private String name;
	private String password;
	
	//we have to add here mapping n i.e one to one mapping method
	@OneToOne(mappedBy="admin")
	private UserType user;
	public Admin() {
		super();
	}
	
	
	//so if you want to access any another class then we have to go with the getters and setters method
	//so i use here getters and setters method
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
