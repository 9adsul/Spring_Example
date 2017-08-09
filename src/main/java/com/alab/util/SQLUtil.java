package com.alab.util;

public class SQLUtil {

	public static final String GET_ALL_USER_QRY = "SELECT USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ADDRESS,PHONE FROM MF_USER";
	public static final String GET_USER_BY_ID_QRY = "SELECT USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ADDRESS,PHONE FROM MF_USER WHERE USERNAME=?";
	public static final String UPDATE_USER_QRY = "";
	public static final String REGISTER_USER_QRY = "INSERT INTO MF_USER VALUES(?,?,?,?,?,?,?)";
	public static final String DELETE_USER_BY_ID_QRY = "";
}
