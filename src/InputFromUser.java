import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer to print :");
		int abc=sc.nextInt();
		System.out.println("enterred integer is :"+abc);
		sc.close();

	}

}
