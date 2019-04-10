package br.ucsal.bes.persistence;

import java.sql.*;

import br.ucsal.bes.model.User;
import br.ucsal.bes.util.BankUtil;

public class UserDAO5 {

	private Connection connection = BankUtil.getConnection();
	private static Connection con = BankUtil.getConnection();
	private PreparedStatement preparedStatement;
	private static Statement pst;
	private ResultSet resultSet;
	
	public static void main(String[] args) {
		createTable("Usuarios");
	}
	
	public static void createTable(String tableName) {
		String id = " (id INT PRIMARY KEY, ";

		try {
			pst = con.createStatement();
			pst.execute("CREATE TABLE " + tableName.toLowerCase() + id
					+ "login CHAR(20), password CHAR(20), email CHAR(20), name CHAR(20));");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertUser(User user) {
		try {
			preparedStatement = connection.prepareStatement("");
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeUser(User user) {
		try {
			preparedStatement = connection.prepareStatement("");
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUser(User user) {
		Boolean validated = false;
		try {
			preparedStatement = connection.prepareStatement("");
			resultSet.close();
			preparedStatement.close();

			if (resultSet.next()) {
				validated = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUser(User user) {
		try {
			preparedStatement = connection.prepareStatement("");
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
