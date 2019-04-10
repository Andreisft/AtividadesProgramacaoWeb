package br.ucsal.bes.util;

import java.sql.*;

public class BankUtil {
	
	private static Connection connection;
	private static final String DRIVER = "jdbc:hsqldb:mem:BankUtil.";
	private static final String USER = "SA";
	private static final String PASSWORD = "";
	
	static {
		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection(DRIVER, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
