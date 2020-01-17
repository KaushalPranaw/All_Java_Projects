package tester;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	private int id;
	private String name;

	@Autowired
	private Add add;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, Add add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
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

	public Add getAdd() {
		return add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	public void display() {
		add.display();
		System.out.println(id+" "+name);
	}

}
