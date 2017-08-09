package com.alab.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alab.model.UserModel;
import com.alab.util.SQLUtil;

@Repository
public class UserDAOImpl implements UserDAO {

	/*
	 * final static private String REGISTER_USER_QRY =
	 * "INSERT INTO MF_USER VALUES(?,?,?,?,?,?,?)";
	 */

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int registerUser(UserModel user) {
		int count = 0;

		count = jt.update(SQLUtil.REGISTER_USER_QRY, user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone());
		return count;
	}

	@Override
	public List<UserModel> getAllUsers() {
		// System.out.println("in dao");
		// System.out.println(jt.getClass().getName());

		List<UserModel> userList = null;
		userList = jt.query(SQLUtil.GET_ALL_USER_QRY, (rs) -> {
			// .out.println("in lambda");
			List<UserModel> list = new ArrayList<>();
			// System.out.println(list.size());
			UserModel user = null;
			while (rs.next()) {
				user = new UserModel();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setFirstname(rs.getString(3));
				user.setLastname(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setAddress(rs.getString(6));
				user.setPhone(rs.getLong(7));
				list.add(user);
			}
			return list;
		});
		return userList;
	}

	@Override
	public UserModel getUserById(String username) {
		UserModel userModel = null;
		userModel = jt.query(SQLUtil.GET_USER_BY_ID_QRY, new Object[] { username }, (rs) -> {
			UserModel user = new UserModel();
			while (rs.next()) {
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setFirstname(rs.getString(3));
				user.setLastname(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setAddress(rs.getString(6));
				user.setPhone(rs.getLong(7));
			}
			return user;
		});
		return userModel;
	}

	@Override
	public int updateUser(UserModel user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

}
