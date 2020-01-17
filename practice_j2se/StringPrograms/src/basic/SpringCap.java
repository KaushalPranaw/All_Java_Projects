package basic;

import java.util.Scanner;

public class SpringCap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		System.out.println(s);
		
		/*String[] sp=s.split("\\s");
		String op="";
		for(String ss:sp)
		{
			String f=ss.substring(0,1).toUpperCase();
			String l = ss.substring(1);
			op+=f+l+" ";
			
		}
			System.out.println(op);*/
		
		String sp[]=s.split(" ");
		String r="";
		for(String s1:sp)
		{
			r+=s1.substring(0,1).toUpperCase()+s1.substring(1)+" ";
		}
			System.out.println(r);
		if(sc!=null)
			sc.close();
	}
}
