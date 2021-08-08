import java.util.*;
public class p13 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the digit :");
		int digit=sc.nextInt();
//		int count=0;
		int counter=0;
//		while(digit!=0)
//		{
//			digit/=10;
//			++count;
//		}
//		System.out.println("the number of digits are :"+count);
		
		for(;digit!=0;digit/=10,++counter)
		{
			
		}
		System.out.println("the number of counted digits are :"+ counter);
		sc.close();	
		
	}
	
	
}
