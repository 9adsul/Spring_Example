package com.alab.service;

import java.util.List;

import com.alab.model.UserModel;

public interface UserService {

	public String registerUser(UserModel user);

	public List<UserModel> getAllUsers();

	public UserModel getUserById(String username);

	public String updateUser(UserModel user);

	public String deleteUser(String username);
}
