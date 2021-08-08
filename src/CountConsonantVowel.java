import java.util.Scanner; 
public class CountConsonantVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the String :");
		String str=sc.nextLine();
		int vowel=0;
		int consonant=0;
		str=str.replaceAll("\\s","");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("total vowels are :"+vowel);
		System.out.println("total consonant are : "+consonant);
		sc.close();
		

	}

	
}
