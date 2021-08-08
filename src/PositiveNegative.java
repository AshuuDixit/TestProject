import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to check :");
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("number is negative");
		}
		else
			System.out.println("number is positive");
sc.close();
	}

}
