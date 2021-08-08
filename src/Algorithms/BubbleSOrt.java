package Algorithms;

public class BubbleSOrt {

	public static void main(String[] args) {
		int[] array= {-1,3,6,7,-88,400,-555};
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(array[j+1]<array[j])
				{
					int temp=array[j];
					array[j]=array[j]+1;
					array[j+1]=temp;
				}
			}
			
		}
		for(int item:array)
		{
			System.out.print(item+" ");
		}
		
		
	}

}
