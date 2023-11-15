package com.java4.jdbctest.board.domain;

public class Board {
	private int id;
	private String user;
	private String title;
	private String content;
	
	public Board() {
	}

	public Board(int id, String user, String title, String content) {
		this.id = id;
		this.user = user;
		this.title = title;
		this.content = content;
	}

	public Board(String user, String title, String content) {
		this.user = user;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
