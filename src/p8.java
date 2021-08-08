import java.util.*;
public class p8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character to check :");
		char chr=sc.next().charAt(0);
		if(chr=='a'|| chr=='e'||chr=='i'||chr=='o'|| chr=='u')
		
			System.out.println("character is vowel");
		
		else
			System.out.println("character is consonant");
	sc.close();	
	}

}
