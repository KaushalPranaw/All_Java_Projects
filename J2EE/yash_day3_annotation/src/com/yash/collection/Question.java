package com.yash.collection;

import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<String> list;

	public Question(int id, String name, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

}
