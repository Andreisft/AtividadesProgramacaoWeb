package br.ucsal.bes.business;

import br.ucsal.bes.exception.InputUserEmptyException;
import br.ucsal.bes.model.User;

public class ChatBO {
	public void InputUser(User user) throws InputUserEmptyException {
		validate(user);
	}

	private void validate(User user) throws InputUserEmptyException {
		if (user.getLogin().trim() == null) {
			throw new InputUserEmptyException("Esse campo é obrigatório");
		}
	}
}
