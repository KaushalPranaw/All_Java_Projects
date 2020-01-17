package com.yash.list;

import java.util.List;
import java.util.Map;

public class Question {

	private int id;
	private String name;
	private List<Answer> list;
	private Map<String, String> map;

	
	public Question(int id, String name, List<Answer> list, Map<String, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.map = map;
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

	public List<Answer> getList() {
		return list;
	}

	public void setList(List<Answer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", list=" + list + ", map=" + map + "]";
	}

	

}
