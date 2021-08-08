import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		boolean prime=false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				prime=true;
				break;
			}
			
		}
	if(prime==true)
	{
		System.out.println("it is not a prime number");
	}
	
	else
		System.out.println("it is  a prime number");

	}
	

}
