package core;

public interface A extends B 
{
	default void a()
	{
		System.out.println("A");
	}
}
