package com.alab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.alab.dao.UserDAO;
import com.alab.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public String registerUser(UserModel user) {
		String status = " Please try Again !!!";
		int count = 0;
		try {
			count = userDAO.registerUser(user);
		} catch (DataAccessException e) {
			// TODO: handle exception
			status = "Try Again !!!";
		}
		if (count > 0)
			status = "Registeration Successful";
		return status;
	}

	@Override
	public List<UserModel> getAllUsers() {
	//	System.out.println("service");
		List<UserModel> userList = null;
		userList = userDAO.getAllUsers();
		System.out.println("s--" + userList.size());
		return userList;
	}

	@Override
	public UserModel getUserById(String username) {
		UserModel user=null;
		user=userDAO.getUserById(username);
		return user;
	}

	@Override
	public String updateUser(UserModel user) {
		System.out.println(user.getUsername());
		return "sucess";
	}

	@Override
	public String deleteUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
