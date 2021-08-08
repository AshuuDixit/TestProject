package Functions;
import java.util.Scanner;
public class PrimeNumber {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num to check");
		int num=sc.nextInt();
		GetPrimeNum(num);
		
		

	}
	public static int GetPrimeNum(int n)
	{
		boolean flag=true;
		for(int i=0;i<=n/2;i++)
		{
			if(n%i==0)
			{
				
			}
		}
		return n;
		
	}

}
