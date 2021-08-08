import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check :");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("entered number is even ");
		}
		else
		{
			System.out.println("entered number is odd");
		}
		sc.close();

	}

}
