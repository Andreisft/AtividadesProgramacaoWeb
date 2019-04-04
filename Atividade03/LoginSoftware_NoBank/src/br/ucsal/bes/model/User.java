package br.ucsal.bes.model;

public class User {
	private String login;
	private String password;
	private String email;
	private String name;
	
	public User() {
		
	}
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public User(String login, String password, String email, String name) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + ", name=" + name + "]";
	}

}
