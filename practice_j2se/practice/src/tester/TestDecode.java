package tester;

public class TestDecode {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		String arr2[]={"A","B","c"};
		int k=20;
		int la1=arr.length;
		int arrPos=k%(la1) ;
		int arr2Pos=k / la1;
		System.out.println(arr[arrPos]+" "+arr2[arr2Pos]);
//		if(k>la1)
//		{
//			int n=k/la1;
//			int n2=k%la1;
//			String s=arr2[n];
//			int 
//		}
		
		/*String s1=new String("shri");
		String s2=new String("shri");
		System.out.println(s1==s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));*/
		
		String s1="pranaw";
		String s4=new String("pranaw");
	/*	System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));
		
		s4.intern();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));*/
		
		//String s2="pranawkaushal";
		//String s3=(s1+"kaushal").intern();
		s4.intern();
		System.out.println(s1==s4);
		
		
	}
}
