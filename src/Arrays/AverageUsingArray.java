package Arrays;
import java.util.Scanner;
public class AverageUsingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the total num of students:");
		int n=sc.nextInt();
		double sum=0;
		double[] marks=new double[n];
		System.out.print("enter the elements in arrays: ");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextDouble();
			
		}
		
		for(int i=0;i<=marks.length-1;i++)
		{
			sum+=marks[i];
			
		}
		System.out.print("average of "+n+" marks is :");
		System.out.format("%.3f",sum/marks.length);
		sc.close();
		
		

	}

}
