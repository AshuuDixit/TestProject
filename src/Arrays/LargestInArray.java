package Arrays;
import java.util.Scanner;
public class LargestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements in array :");
		int n=sc.nextInt();
		System.out.print("enter the elements in the array");
		double numbers[]=new double[n];
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextDouble();
		}
		double largest=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
				
			}
		}
		
			System.out.println("largest element in the array is: "+largest);
			sc.close();
		}
		
		

	}


