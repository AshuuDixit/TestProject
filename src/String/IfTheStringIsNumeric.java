package String;

import java.util.Scanner;

public class IfTheStringIsNumeric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String str=sc.nextLine();
		boolean numeric =true;
		try
		{
			Double num=Double.parseDouble(str);
			
		}
		catch(NumberFormatException e)
		{
			numeric=false;
		}
		
		if(numeric)
		{
			System.out.println("string is numeric");
		}
		else
			System.out.println("string is not numeric");
		

	}

}
