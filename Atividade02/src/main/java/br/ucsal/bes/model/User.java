package br.ucsal.bes.model;

public class User {
	
	private String login;
	
	public User() {
	}
	
	public User(String login) {
		super();
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return this.login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return this.login.equals(user.getLogin());
	}
	
}
