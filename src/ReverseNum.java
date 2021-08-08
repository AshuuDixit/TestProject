import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int temp=0;
		
		while(num!=0)
		{
			int digit=num%10;
			temp=temp*10+digit;
			num/=10;
		}
		System.out.println("reversed number is :"+temp);
		sc.close();

	}

}
