import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the two numbers:");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	System.out.print("enter the character :");
	char operator=sc.next().charAt(0);
	double result=0;
	switch(operator)
	{
	case '+':
	{
		result=a+b;
		System.out.println(result);
		break;
		
	}
	case '-':
	{
		result=a-b;
		System.out.println(result);
		break;
		
	}
	case '*':
	{
		result=a*b;
		System.out.println(result);
		break;
		
	}
	case '/':
	{
		result=a/b;
		System.out.println(result);
		break;
		
	}
	default:
	{
		System.out.println("Invalid operator");
	}
	
}
	}
}
