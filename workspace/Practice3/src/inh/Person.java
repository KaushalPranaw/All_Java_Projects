package inh;

/**
 * @author pranaw.kaushal
 *
 */
public class Person {

	String fname;
	String lname;

	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}
