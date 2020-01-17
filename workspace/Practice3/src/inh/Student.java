package inh;

public class Student extends Person {
	private int gradyear;

	public Student(String fname, String lname, int gradyear) {
		super(fname, lname);
		this.gradyear = gradyear;
	}

	@Override
	public String toString() {
		return "Student [gradyear=" + gradyear + ", fname=" + fname + ", lname=" + lname + "]";
	}

	 

	
	
}
