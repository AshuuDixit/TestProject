import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int frequency=0;
		System.out.print("enter the string :");
		String str=sc.nextLine();
		System.out.print("enter the character to check frequency of :");
		char ch=sc.next().charAt(0);
	
		
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				++frequency;
			}
		}
		System.out.println("frequency of character "+ch+ " is :"+frequency);
		sc.close();
		


	}

}
