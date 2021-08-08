import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to find factorial of :");
		int num=sc.nextInt();
		long factorial=1;
		while(num!=0)
		{
			System.out.print(num+"*");
			factorial*=num;
			num--;
			
		}
		System.out.println("factorial is "+factorial);
		sc.close();
	}

	

}
