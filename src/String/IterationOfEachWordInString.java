package String;
import java.util.Scanner;
public class IterationOfEachWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.print(ch+", ");
		}
		str.charAt(str.length());
		sc.close();
	}

}
