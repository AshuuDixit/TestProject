import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
			
			
		}
		System.out.println(count);
		sc.close();

	}

}
