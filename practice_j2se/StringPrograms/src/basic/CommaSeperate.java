package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommaSeperate {

	public static void main(String[] args) {
		String s[]= {"a","artbe","rgfha","axxx","a","d",};
		List<String> l=Arrays.asList(s);
		String res=l.stream().reduce((s1,s2)->s1+","+s2).get();
		System.out.println(res);
	}
}
