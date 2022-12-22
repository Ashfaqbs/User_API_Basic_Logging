package com.user.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "USER_APIs")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Games> games;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private School school;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public User(int id, String name, String address, List<Games> games, School school) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.games = games;
		this.school = school;
	}

	
	

	public School getSchool() {
		return school;
	}




	public void setSchool(School school) {
		this.school = school;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public List<Games> getGames() {
		return games;
	}


	public void setGames(List<Games> games) {
		this.games = games;
	}



}
