package lambda7_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
	 public int compare(Integer a,Integer b)
	 {
		/* if(a<b)
		 {
			 return -1;
		 }
		 else if(a>b)
			 return +1;
		 else
			 return 0;*/
		 
		 return (a<b)?-1:((a>b)?1:0);
	 }
}

public class TesterWithoutLExp {

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
		 
		 Collections.sort(l, new MyComparator());
		 System.out.println(l);
	}
}
