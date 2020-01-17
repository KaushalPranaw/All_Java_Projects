package dependsOn;

public class Bean3 {

	public Bean3() {
		System.out.println("in const "+getClass().getName());
	}
	
	void display()
	{
		System.out.println("Bean3");
	}
}
