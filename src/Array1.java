import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students :");
		int n=sc.nextInt();
		System.out.print("Enter the marks of "+ n+" students :");
		int[] marks=new int[n];
		
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		int averagemarks=0;
		for(int  i=0;i<n;i++)
		{
			averagemarks+=marks[i];
		}
		averagemarks/=n;
		System.out.println("total average of student's marks :"+averagemarks);
		sc.close();
	}

}
