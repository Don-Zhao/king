package com.king.model;

public class Member {
	private int id;
	
	private String name;
	
	private String url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Member(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Member() {
		
	}
	
	
}
