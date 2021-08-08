package String;
import java.util.Scanner;
public class CapitalizeFirstLetterOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String result;
		String str=sc.nextLine();
		String first=str.substring(0,1);
		String second=str.substring(1,str.length());
		first=first.toUpperCase();
		result=first+second;
		System.out.println("updated string is "+result);
		sc.close();
		
		
	}

}
