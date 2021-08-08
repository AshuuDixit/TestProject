package Collection;
import java.util.*;
public class tut6 {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(23);
		ad.pop();
		System.out.println(ad);
		ad.push(12);
		ad.push(88);
		ad.push(777);
		ad.pop();
		System.out.println(ad);
		System.out.println();
		
		

	}

}
