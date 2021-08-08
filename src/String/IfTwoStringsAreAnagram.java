package String;
import java.util.Arrays;
import java.util.Scanner;
public class IfTwoStringsAreAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean anagram=true;
		System.out.print("enter the two strings :");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()==str2.length())
		{
		char[] char1=str1.toCharArray();
		char[] char2=str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if(Arrays.equals(char1, char2))
		{
			anagram=true;
		}
		else {
			anagram=false;
		}
		
		if(anagram)
		{
			System.out.println("string is an anagram");
		}
		else
		{
			System.out.println("String is not an anagram");
		}
		sc.close();
		

	}
	}

	

}
