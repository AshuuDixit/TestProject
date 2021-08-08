import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num :");
		int num=sc.nextInt();
		int temp=num;
		int temp1=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			temp1=temp1*10+digit;
			num/=10;
			
		}
		if(temp==temp1)
		{
			System.out.println("it is a palindrome number");
		}
		else
			System.out.println("it is not a palindrome number");
		sc.close();

	}

}
