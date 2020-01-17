package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Emp {
	final int i = 5;
	private int id;

	// int Global=10;

	public Emp() {

	}

	public Emp(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + "]";
	}

}

class Mgr extends Emp {
	private String name;

	public Mgr(int id, String name) {
		super(id);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mgr [name=" + name + "]" + super.toString();
	}

}

class SalesMgr extends Mgr {
	private double salary;

	public SalesMgr(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalesMgr [salary=" + salary + "]" + super.toString();
	}

}

public class Test {

	static void fun1(List<? extends Mgr> list) {
		// List<SalesMgr> emp=new ArrayList<>();
		// emp.addAll(list);
		// list.addAll(emp);
		// System.out.println(list);
	}

	static void fun2() {
		List<? super Mgr> list = new ArrayList<>();
		list.add(new SalesMgr(1, "a", 1000));
		// List<Emp> emp=new ArrayList<>();
		// emp.addAll(list);
		// .addAll(emp);
		// System.out.println(list);
		list.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// ArrayList<Object> a=new ArrayList<>();
		// a.add(new Mgr());
		// fun2(a);

		fun2();

	}
}
