package core;

public interface Interf {

	public default void display(){
		System.out.println("default");
	}
	public static void displayStatic(){
		System.out.println("static");
	}
	//void accept();
	
}
