import java.util.Scanner;
public class PrimeBtwRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range of numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean prime=false;
		
		for(int i=2;i>a/2 && i<b/2;i++)
		{
			if(a%i==0 && b%i==0)
			{
				prime=true;
			}
			else
				prime=false;
		}
		if(prime=false)
		{
			System.out.println(i);
		}
		sc.close();
		

	}

}
