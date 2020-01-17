package additional_FI;

import java.util.function.Function;

public class TestOperator {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(2));
	}
}
