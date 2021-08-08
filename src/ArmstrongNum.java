import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		int num=sc.nextInt();
		int digit=0;
		int count=0;
		int result=0;
		while(num!=0)
		{
			num/=10;
			
			count++;
			
			
			
		}
		while(num!=0)
		{
			num/=10;
			result=num*count;
			System.out.println(result+"+");
//		}
		
		
		

	}

}
