package br.ucsal.bes.persistence;

import java.sql.*;

import br.ucsal.bes.model.User;
import br.ucsal.bes.util.BankUtil;

public class UserDAO5 {

	private Connection connection = BankUtil.getConnection();
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public void insertUser(User user) {
		try {
			preparedStatement = connection.prepareStatement(
					"INSERT INTO (id, login, password, email, name) VALUES(id=?, login=?, password=?, email=?, name=?)");
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getLogin());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getName());
			preparedStatement.execute();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeUser(User user) {
		try {
			preparedStatement = connection.prepareStatement("");
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUser(User user) {
		Boolean validated = false;
		try {
			preparedStatement = connection.prepareStatement("");
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
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getAll() {
		
	}
}
