import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println(a+ " A is the largest number");
			}
		}
		else if(b>=c)
		{
			System.out.println(b+" B is the largest");
		}
		else
		{
			System.out.println(c+" C is the largest number");
		}
		sc.close();

	}

}
