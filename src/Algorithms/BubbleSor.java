package Algorithms;
import java.util.*;
public class BubbleSor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]= {11,220,-45,-6,406,-3216};
		int size=array.length;
		System.out.println("how to sort the array:\n 1- for ascending order \n 2-for descending order");
		int operation=sc.nextInt();
		if(operation==1)
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=0;j<size-1;j++)
				{
					if(array[j]>array[j+1])
					{
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}
		else if(operation ==2)
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=0;j<size-1;j++)
				{
					if(array[j]<array[j+1])
					{
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}
		System.out.println("sorted array is:");
		for(int item:array)
		{
			System.out.print(item+" ");
		}
		sc.close();

	
	}

}
