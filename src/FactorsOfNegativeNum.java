import java.util.Scanner;

public class FactorsOfNegativeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the num: ");
		int num=sc.nextInt();
		for(int i=num;i<=Math.abs(num);i++)
		{
			if(i==0)
			{
				continue;
			}
			else if (num%i==0)
			{
				System.out.print(i+ " ");
			}
		}
	}

}
