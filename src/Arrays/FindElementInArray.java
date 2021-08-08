package Arrays;
import java.util.Scanner;
public class FindElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the element to find:");
		int tofind=sc.nextInt();
		int[] firstarray= {1,2,3,4,5,6,7,8,9};
		boolean found=false;
		
		for(int num: firstarray)
		{
			if(num==tofind)
			{
				found=true;
				break;
			}
				
			}
		if(found==true)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
		

}
}
