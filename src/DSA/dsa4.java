package DSA;
import java.util.*;
public class dsa4 {

	public static void main(String[] args) {
		int array[]= {0,1,2,2,1,1,1,1,0,0,0,2,2,1,0};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int count0=0,count1=0,count2=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				count0++;
			 if(array[i]==1)
				count1++;
			if(array[i]==2)
			count2++;
			
		}
		for(int j=0;j<count0;j++)
		{
			array[j]=0;
		System.out.print(array[j]+" ,");
		}
		for(int j=0;j<count1;j++)
		{
			array[j]=1;
		System.out.print(array[j]+" ,");
		}
		for(int j=0;j<count2;j++)
		{
			array[j]=2;
		System.out.print(array[j]+" ,");
		}

	}

}
