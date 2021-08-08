import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to print :");
		int num=sc.nextInt();
		System.out.println("enter the character to print :");
		char chr=sc.next().charAt(0);
		String a=sc.nextLine();
		System.out.println("enter the string to print :");
		String str=sc.nextLine();
		System.out.println("int is :"+num);
		System.out.println("char is :"+chr);
		System.out.println("String is :"+str);
		sc.close();
				

	}

}
