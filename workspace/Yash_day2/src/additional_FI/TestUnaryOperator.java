package additional_FI;
 
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Integer> unaryOperator=i->i*i;
		System.out.println(unaryOperator.apply(5));
	}
}
