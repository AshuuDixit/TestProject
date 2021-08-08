package DSA;

public class dsa1 {
	
	
	 static void reversefunc(int arr[],int n)
	 {
		 int j=n;
		 int arr2[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr2[j-1]=arr[i];
			 j=j-1;
			 
		 }
		 System.out.println("Reversed array is:");
		 for(int k=0;k<n;k++)
		 {
			System.out.print(arr2[k]+" "); 
		 }
		 
	 }

	
	 
	 public static void main(String[] args) 
	 {
		int array[]= {1,2,3,4,5,6,7};
		int n=array.length;
		reversefunc(array,n);
	 }
			

}


