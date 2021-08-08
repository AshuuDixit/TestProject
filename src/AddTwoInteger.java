import java.util.Scanner;

public class AddTwoInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two integers to add :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum is : "+c);
		sc.close();

	}

}
