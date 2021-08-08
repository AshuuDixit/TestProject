import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String str=sc.nextLine();
		str=str.replaceAll("\\s","");
		System.out.print("Removed space string is: "+str);
		sc.close();
		
		

	}

}
