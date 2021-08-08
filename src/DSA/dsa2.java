package DSA;
public class dsa2 {
	static int  minfunc(int arr[],int n)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]<min) 
		{
			min=arr[i];
			
		}	
		}
		return min;
	}
		static int  maxfunc(int arr[],int n)
		{
			int max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}	
		}
			return max;
		}


	public static void main(String[] args) {
		
		int array[]=new int[] {91,25,333347,104,69,557,55};
		dsa2 m=new dsa2();
		
		
		int n=array.length;
//		minfunc(array,n);
//		maxfunc(array,n);
		System.out.println("minimum element is:"+m.minfunc(array,n));
		System.out.println("maximum element is :"+m.maxfunc(array, n));

	}

}
