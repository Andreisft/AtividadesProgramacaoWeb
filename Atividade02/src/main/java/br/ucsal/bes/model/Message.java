package br.ucsal.bes.model;

public class Message {
	
	private String text;
	private User origin;
	private User destiny;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getOrigin() {
		return origin;
	}

	public void setOrigin(User origin) {
		this.origin = origin;
	}

	public User getDestiny() {
		return destiny;
	}

	public void setDestiny(User destiny) {
		this.destiny = destiny;
	}

	@Override
	public String toString() {
		return this.origin + ": " + this.text + "\n";
	}
	
}
