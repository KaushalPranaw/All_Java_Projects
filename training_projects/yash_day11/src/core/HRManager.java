package core;

public class HRManager extends Manager {

	private String hr;

	public HRManager(int id, String name, double salary, String department, String hr) {
		super(id, name, salary, department);
		this.hr = hr;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	@Override
	public String toString() {
		return "HRManager [hr=" + hr + "]";
	}
	
}
