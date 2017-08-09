package com.alab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alab.model.UserModel;
import com.alab.service.UserService;

@RestController
public class UserConntroller {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public @ResponseBody String registerUser() {
		// String status=userService.registerUser(user);
		return "home";

	}

	@RequestMapping(value = "allusers", method = RequestMethod.GET)
	public List<UserModel> getAllUsers() {
		// System.out.println("controller");
		List<UserModel> userList = null;
		userList = userService.getAllUsers();
		return userList;
	}

	@RequestMapping(value = "userbyId/{username}", method = RequestMethod.GET)
	public UserModel getUserById(@PathVariable("username") String username) {
		UserModel user = null;
		user = userService.getUserById(username);
		return user;
	}

	@RequestMapping(value = "updateUser/{username}", method = RequestMethod.PUT)
	public String updateUse(@RequestBody UserModel user, @PathVariable("username") String usrname) {
		String status = null;
		status = userService.updateUser(user);
		return status;

	}

}
