import java.util.Scanner;
public class WhetherAlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.print("enter the character to check :");
				char ch=sc.next().charAt(0);
				int temp=ch;
				if(temp >=65&& temp<=90 || temp<=122 && temp>=97)
				{
					System.out.println("it is a alphabet");
				}
				else
				{
					System.out.println("not a alphabet");
				}
				sc.close();

	}

}
