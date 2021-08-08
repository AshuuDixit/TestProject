import java.util.Scanner;

public class PyramidPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of rows :");
		int row=sc.nextInt();
		System.out.print("enter the no of column :");
		int column=sc.nextInt();
		

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  *");
			}
			System.out.println();
		}

	}

}
