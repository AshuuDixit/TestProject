import java.util.Scanner;

public class MultiplyTwoFloats {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two floats to multiply :");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=a*b;
		System.out.println("multiplication is :"+c);
		sc.close();

	}

}
