//LINKED LIST



package Collection;
import java.util.*;


public class tut3 {
	
	
	

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<>(); 
		List<Integer> al=new ArrayList<>(); 
//		ll.add(12);
//		ll.add(14);
//		ll.add(412);
//		ll.add(162);
//		ll.add(182);
//		System.out.println(ll);
		getTimeDiff(al);
		getTimeDiff(ll);
		
		

	}
	 static  void getTimeDiff(List<Integer> list)
	 {
		 long start=System.currentTimeMillis();
		 for(int i=0;i<100000;i++)
		 {
			 list.add(0,i);
		 }
		 long end=System.currentTimeMillis();
		 System.out.println(list.getClass().getName()+"-->"+(end-start));
	 }

}
