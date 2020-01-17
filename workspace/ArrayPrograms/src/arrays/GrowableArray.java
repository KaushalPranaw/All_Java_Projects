/*package arrays;

import java.util.Scanner;

public class GrowableArray {
	public static void main(String[] args) {
		
				System.out.println("size is full now you still want to insert then insert the size");
				System.out.println("Press 1 for insert and 2 for cancel");
				switch(sc.nextInt())
				{
				case 1:
					i=0;
					size=size*2;
					break;
				case 2:
					break;
				default:
					System.out.println("Wrong choice");
				}
		
		
		insert();
				
	
		display(a,size);
		
	}
	static void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the elements");
		int size=sc.nextInt();
		int a[],b[];
			a=new int[size];
			b=new int[size];
		
		System.out.println("Enter elements.....");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
			if(i+1==size)
			{
					i=0;
					size=size*2;
					a=new int[size];
					for(int j=0;j<b.length;j++)
					{
						a[j]=b[j];
						i=j;
						
					}
					b=new int[size];
			}
		}
	}
	
	 
	static void display(int a[],int size)
	{
		int count=0;
		System.out.println("Elements are.....");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
			count++;
		}
		System.out.println("size of the arrays = "+count);
	}
}
*/