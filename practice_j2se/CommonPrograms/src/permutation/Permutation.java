package permutation;

public class Permutation {

	static int c;
	public static void main(String[] args) {
		int a[]= {1,2,3};
		permute(a,a.length,a.length);
		System.out.println(c);
		
	}
	static void permute(int a[],int size,int n)
	{
		if(size==1)
		{
			print(a,n);
			c++;
		}
		for(int i=0;i<size;i++)
		{
			permute(a,size-1,n);
			/*if(i+1<n)
			{
				int t=a[0];
				a[0]=a[i+1];
				a[i+1]=t;
			}*/
			
		}
	}
	
	static void print(int a[],int n)
	{
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
