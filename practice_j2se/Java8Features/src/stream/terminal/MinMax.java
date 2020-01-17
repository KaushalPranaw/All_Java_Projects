package stream.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,4,5,666,6);
		int min=list.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(min);
		/*
		int max=list.stream().min((i,j)->j.compareTo(i)).get();
		System.out.println(max);*/
		
		/*int max=list.stream().max((i,j)->i.compareTo(j)).get();*/
		int max=list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
	}
}
