import java.util.*;

class practice1
 {
	
        public static int[] reversearray(int array1[],int n)
     {
         
         int newarray[]=new int[n];
         for(int i=0;i<n;i++)
         {
             newarray[i]=array1[n-1-i];
         }
         return newarray;
     } 
     
     
	
	
	
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	
	 int N=sc.nextInt();
    int array[]=new int[N];
    for(int i=0;i<N;i++)
    {
        array[i]=sc.nextInt();
    }
    int[] reverse=reversearray(array,N);
    System.out.println(reverse);
	 
	 
	 }
}