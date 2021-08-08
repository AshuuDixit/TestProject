import java.util.Scanner;

public class p3 {

	public static void main(String[] args) 
	{
		float result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num :");
		float first=sc.nextFloat();
		System.out.println("enter the second num :");
		float second=sc.nextFloat();
		result=first*second;
		System.out.println("result is:"+result);
		sc.close();
	}

}