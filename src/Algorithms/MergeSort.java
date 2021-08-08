package Algorithms;

public class MergeSort {
	 static void mergesort(a,l,r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,r);
			merge(a,l,mid,r);
			
		}
		
	}
	

	public static void main(String[] args) {
		int array[]=mergesort(a,0,6);
		

	}

}
