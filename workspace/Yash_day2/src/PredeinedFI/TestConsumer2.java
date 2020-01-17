package PredeinedFI; 
import java.util.function.*;
 
class Students {
	String name;
	double salary;
	public Students(String name, double salary) {
		 
		this.name = name;
		this.salary = salary;
	}
	
}
public class TestConsumer2 {
	 
	public static void main(String[] args) {
		 
		 Consumer<Students> c=s->{
			 System.out.print("Student => name: "+s.name);
			 System.out.println(" , salary "+s.salary);
		 };
		 
		 c.accept(new Students("pranaw", 100000));
		 c.accept(new Students("pranawkaushal", 100000));
		 
	}

}
