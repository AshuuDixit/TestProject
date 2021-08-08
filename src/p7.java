import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num to check :");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println(num+" num is even ");
	}
	else
		System.out.println(num+" num is odd");
	sc.close();
	}
	

}
