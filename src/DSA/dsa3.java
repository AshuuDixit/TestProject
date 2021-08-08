package DSA;
import java.util.*;
public class dsa3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the kth place to find min :");
		int kmin=sc.nextInt();
		System.out.println("enter the kth place to find max:");
		int kmax=sc.nextInt();
		
		int array[]= {12,23,35,47,85,996,7};
		Arrays.sort(array);
		System.out.println("sorted array is:");
		System.out.println(Arrays.toString(array));
		System.out.println(kmin+"th  min element is : "+array[kmin-1]);
		System.out.println(kmax+"th  max element is :"+array[array.length-kmax]);
	

	}

}
