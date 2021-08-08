package Collection;

import java.util.ArrayList;
import java.util.List;

public class AddAllLists {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("ashu");
		List<String> list2=new ArrayList<String>();
		list2.add("is");
		List <String> list3=new ArrayList<String>();
		list3.add(" my name");
		List<String> added=new ArrayList<String>();
		 added.addAll(list1);
		 added.addAll(list2);
		 added.addAll(list3);
		 System.out.println("first list is :"+ list1);
		 System.out.println("second list is :"+ list2);
		 System.out.println("third list is :"+ list3);
		 System.out.print("final list is :"+ added);
		
				

	}

}
