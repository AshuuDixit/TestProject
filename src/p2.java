import java.util.Scanner;

public class p2 {

	public static void main(String[] args) 
	{
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num :");
		int first=sc.nextInt();
		System.out.println("enter the second num :");
		int second=sc.nextInt();
		result=first+second;
		System.out.println("result is:"+result);
		sc.close();
	}

}
