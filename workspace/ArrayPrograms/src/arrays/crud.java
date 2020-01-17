package arrays;

import java.util.Scanner;

public class crud {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int exit=0,j=0;
		System.out.println("Enter");
		
		while(exit!=4)
		{
			System.out.println("1 insert \n"
					+ "2 delete\n"
					+ "3 display\n");
			switch(sc.nextInt())
			{
				case 1: 
					
					if(j<size)
					{
						System.out.println("enter element");
						int num=sc.nextInt();					 
						a[j++]=num;
						break;
					}
					if(j==size)
					{
						System.out.println("Size is full");
						break;
					}
					
				case 2:
					System.out.println("Enter position");
					int pos=sc.nextInt();
					for(int i=0;i<j;i++)
					{
						if(i==pos)
						{
							a[i]=a[i+1];
						}
					}
					System.out.println("element deleted");
					j--;
					System.out.println();
					break;
				case 3:
					for(int i=0;i<j;i++)
					{
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 4:
					exit=4;
					break;
				default:
					System.out.println("Wrong choice please try again");
					break;
			}
		}
		
	}
}
