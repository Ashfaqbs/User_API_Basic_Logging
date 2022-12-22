package com.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	private String name;
	
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private User user;

	public School(int id, String name, String city, User user) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.user = user;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) { 
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
