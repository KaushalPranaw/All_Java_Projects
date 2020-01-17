package com.demo.clone;

public class CloneDemo implements Cloneable {

	int id;
	String name;
	public CloneDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "CloneDemo [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		CloneDemo c=new CloneDemo(5,"abc");
		CloneDemo c1;
		try {
			c1 = (CloneDemo) c.clone();
			System.out.println(c1);
			c1.setId(1);
			c1.setName("abcccccc");
			System.out.println(c1);
			System.out.println(c);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
