package additional_FI;
 
import java.util.function.BinaryOperator; 

public class TestBinaryOperator {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
		System.out.println(binaryOperator.apply(2, 5));
	}
}
