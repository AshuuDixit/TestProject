import java.util.*;
public class p12 {
	public static void main(String[] args)
	{
		boolean leap=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year to check :");
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
			}
			}
			else 
			{
				leap=true;
			}
		}
		else
			leap=false;
		if(leap==true)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
		
	}

}
