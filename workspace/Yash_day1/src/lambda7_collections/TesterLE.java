package lambda7_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 

public class TesterLE {

	public static void main(String[] args) {
		 ArrayList<Integer> l=new ArrayList<>();
		 l.add(20);
		 l.add(10);
		 l.add(30);
		 l.add(1);
		 l.add(50);
		 l.add(60);
		 System.out.println(l);
		 
		 for(int i:l)
			 System.out.println(i);
		 Comparator<Integer> c= (a,b)->(a<b)?-1:((a>b)?1:0);
		 Collections.sort(l,c);
		 System.out.println(l);
	}
}
