package com.alab.dao;

import java.util.List;

import com.alab.model.UserModel;

public interface UserDAO {

	public int registerUser(UserModel user);

	public List<UserModel> getAllUsers();

	public UserModel getUserById(String username);

	public int updateUser(UserModel user);

	public int deleteUser(String username);
}
