import java.util.*;
public class p5 {

	public static void main(String[] args) {
		int quotient,remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dividend :");
		int dividend=sc.nextInt();
		System.out.println("enter the divisor :");
		int divisor=sc.nextInt();
		quotient=dividend/divisor;
		remainder=dividend%divisor;
		System.out.println("quotient is :"+quotient);
		System.out.println("remainder is  :"+remainder);
		sc.close();
		
	}

}
