import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.print("enter the alphabet to check :");
char ch=sc.next().charAt(0);
if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
{
	System.out.println("alphabet is vowel");
	
	
}
else
	System.out.println("alphabet is consonant");
sc.close();


	}

}