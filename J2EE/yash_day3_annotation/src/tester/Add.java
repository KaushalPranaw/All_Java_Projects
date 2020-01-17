package tester;

import java.util.ArrayList;
import java.util.List;

public class Add {

	private String area;
	private String city;
	private List<String> list;
	
	public Add(String area, String city, List<String> list) {
		super();
		this.area = area;
		this.city = city;
		this.list = list;
	}
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		
		this.list = list;
	}
	
	
	
	@Override
	public String toString() {
		return "Add [area=" + area + ", city=" + city + ", list=" + list + "]";
	}
	
	public void display() {
		System.out.println(area);
		System.out.println(city);
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.forEach(System.out::println);
	}
	
	
	
}
