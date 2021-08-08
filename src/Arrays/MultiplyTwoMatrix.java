package Arrays;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		int rows=3;
		int columns=2;
		int[][] firstmatrix= {{1,2,3},{1,25,3}};
		int[][] secondmatrix={{1,2,3},{1,22,3}};
		int [][] multiply=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				multiply[i][j]=firstmatrix[i][j]*secondmatrix[i][j];
			}
		}
		System.out.println("Product of two matrices is");
		for(int[] row:multiply)
		{
			for(int column :row )
			{
				System.out.print(column+"  ");
			}
			System.out.println();
		}
	}
}
		
