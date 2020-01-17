package PredeinedFI_twoargument;

import java.util.function.BiPredicate;

public class TestBiPredicate1 {

	public static void main(String[] args) {
		//sum of two number is even or not
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(2, 3));
		System.out.println(p.test(15, 3));
	}
}
