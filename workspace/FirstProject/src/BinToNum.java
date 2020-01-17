import java.util.Scanner;

public class BinToNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number in bin to get into decimal");
		int num=sc.nextInt();
		int sum=0;
		int i=0;
		while(num!=0)
		{
			int last=num%10;
			sum+=Math.pow(2,i++)*last;
			num=num/10;
		}
		System.out.println("Number in decimal : "+sum);
	}
}
