import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  of digits to generate fibonacci series upto :");
		int num=sc.nextInt();
		int firstnum=0;
		int secondnum=1;
		int i=1,fibo;
		System.out.print("fobonacci series is :");
		while(i<=num)
		{
			
			System.out.print(firstnum+" ");
		fibo=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=fibo;
		i++;
		}
		
		

	}

}
