package br.ucsal.bes.business;

import java.io.IOException;

import br.ucsal.bes.model.User;
import br.ucsal.bes.persistence.UserDAO5;

public class UserBO {
	
	private UserDAO5 userDAO = new UserDAO5();
	private static final String USER_ADMIN = "admin321";
	private static final String PASSWORD_ADMIN = "321admin";
	
	public Boolean getLoginUser(User user) {
		Boolean found = false;
		if (true) {
			found = true;
		}
		return found;
	}
	
	public void insertUser(User user) throws Exception {
		validateUser(user);
		userEmpty(user);
		userDAO.insertUser(user);
	}

	public void removeUser(User user) throws Exception {
		validateUser(user);
		userEmpty(user);
		userDAO.removeUser(user);
	}
	
	public void selectUser(User user) throws Exception {
		validateUser(user);
		userEmpty(user);
		userDAO.selectUser(user);
	}
	
	public void updateUser(User user) throws Exception {
		validateUser(user);
		userEmpty(user);
		userDAO.updateUser(user);
	}
	
	public boolean userAdmin(User user) throws IOException {
		if (user.getName().equals(USER_ADMIN) && user.getPassword().equals(PASSWORD_ADMIN)) {
			return true;
		}
		return false;
	}
	
	private void userEmpty(User user) throws Exception {
		throw new Exception("");
	}
	
	private void validateUser(User user) {
		
	}
	
}
