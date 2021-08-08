import java.util.Scanner;
public class ReverseNum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int lastdigit=0;
		int temp=0;
		while(num!=0)
		{
			lastdigit=num%10;
			temp=temp*10+lastdigit;
			num/=10;
			
			
			
		}
		System.out.println(temp);
		sc.close();
		

	}

}
