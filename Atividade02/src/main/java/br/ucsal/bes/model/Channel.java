package br.ucsal.bes.model;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List<Message> posts = new ArrayList<>();
	
	private List<User> users = new ArrayList<>();

	public List<Message> getPosts() {
		return posts;
	}

	public void setPosts(List<Message> posts) {
		this.posts = posts;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}
