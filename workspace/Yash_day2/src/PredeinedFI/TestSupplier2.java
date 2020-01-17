package PredeinedFI; 
import java.util.function.*;

public class TestSupplier2 {
	 
	public static void main(String[] args) {
		 
		//random OTP
		
		Supplier<String> s=()->
		{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
	}

}
