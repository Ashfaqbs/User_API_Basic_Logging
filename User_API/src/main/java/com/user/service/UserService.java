package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.model.User;

@Service
public class UserService {


	@Autowired
	private UserDao dao;



	//getall
	public List<User> getallUsers()
	{

		List<User> list=null;
		try {
			list=this.dao.findAll();


		} catch (Exception e) {

		}

		return list;
	}



	//get one
	public User getUser(int id)
	{
		User user = null;
		try {

			user=this.dao.findById(id).get();


		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	}

	//create 

	public User createUser(User user1)
	{
		
		try {
			this.dao.save(user1);
			this.dao.save(user1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user1;
	}


	//update
	public User updateUser(User user1, int id)
	{
		User user =null;
		try {
			user =this.dao.save(user1);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return user;
	}

	//delete
	public String deleteUser(int id)
	{
		try {
			this.dao.deleteById(id);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return new String("User deleted");
	}













}
