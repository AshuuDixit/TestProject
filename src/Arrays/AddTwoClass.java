package Arrays;
import java.util.Scanner;
public class AddTwoClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int rows=2;
		int columns=3;
		int[][] firstarray=  {{29,53,34},{31,67,98}};
		int[][] secondarray= {{63,25,13},{53,76,99}};
		int[][]sum=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum[i][j]=firstarray[i][i]+secondarray[i][j];
			}
		}
		 System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	}
	        sc.close();

}
}
