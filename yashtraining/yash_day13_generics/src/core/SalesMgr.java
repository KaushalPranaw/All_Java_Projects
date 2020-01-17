package core;

public class SalesMgr extends Mgr {

	private String depart;

	public SalesMgr(int id, String name, double salary, String depart) {
		super(id, name, salary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	
	
}
