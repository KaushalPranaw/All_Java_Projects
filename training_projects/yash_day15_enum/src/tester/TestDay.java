package tester;

import java.util.Scanner;

import core.Color;
import core.Days;

public class TestDay {
	static void check(int n)
	{
		for(Days d:Days.values())
		{
			if(d.ordinal()==n)
				System.out.println(d);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 0:
			check(0);
			break;
		case 1:
			check(1);
			break;
		case 2:
			check(2);
			break;
		case 3:
			check(3);
			break;
		case 4:
			check(4);
			break;
		case 5:
			check(5);
			break;
		case 6:
			check(6);
			break;
		 
		default:
			System.out.println("no enum");
			break;
		}

		
	}
}
