import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to generate table :");
		int num=sc.nextInt();
		int i=1;
		int multiply=1;
		while( i<=10)
		{
			multiply=num*i;
			System.out.println(num+"*"+i+"="+multiply);
			i++;
		}
		sc.close();
		

	}

}
