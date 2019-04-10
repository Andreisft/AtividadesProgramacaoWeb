package br.ucsal.bes.persistence;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes.model.User;

public class UserDAO {
	private List<User> users = new ArrayList<>();

	public UserDAO() {
		load();
	}

	public String md5(String text) {
		MessageDigest messageDigest = null;

		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(text.getBytes(), 0, text.length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return "" + new BigInteger(1, messageDigest.digest()).toString(10);
	}

	private void load() {
		String s = md5("12345");
		users.add(new User("pedro", s, "pedro@ucsal.br", "Pedro L"));
		users.add(new User("bruno", s, "bruno@ucsal.br", "Bruno C"));
		users.add(new User("paulo", s, "paulo@ucsal.br", "Paulo S"));
		users.add(new User("marco", s, "marco@ucsal.br", "Marco S"));

	}

	public List<User> getAll() {
		return users;
	}
}
