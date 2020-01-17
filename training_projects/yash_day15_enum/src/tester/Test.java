package tester;

import core.Color;

public class Test {

	public static void main(String[] args) {
		//Color c = Color.BLACK;
		
		//get all enums
		for(Color c:Color.values())
		{
			//System.out.println(c);
			System.out.println(c.ordinal()+" " +c);
		}
		
	}
}
