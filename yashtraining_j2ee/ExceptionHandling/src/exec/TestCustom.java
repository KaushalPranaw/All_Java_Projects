package exec;

class AgeException extends Exception
{
	public AgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class TestCustom {

	public static void main(String[] args) {
		int age=20;
		try {
			validate(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void validate(int age) throws AgeException
	{
		if(age<15)
			throw new AgeException("less age");
		else
			System.out.println("rigt age");
	}
}
