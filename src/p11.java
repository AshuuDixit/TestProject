import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String abc=sc.nextLine();
		char ch='B';
		int frequency=0;
		for(int i=0;i<abc.length();i++)
		{
		if(ch==abc.charAt(i))
		{
			frequency++;
		}
		}
		System.out.println("freuency of character"+ch+" is :"+frequency);
		sc.close();
	}

}
