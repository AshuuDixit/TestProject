package Collection;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("ashu" );
		list1.add("is my ");
		list1.add("name");
		System.out.print("ArrayList is:"+list1);
		String[] newlist=new String[ list1.size()];
		list1.toArray(newlist);
		System.out.println();
		System.out.print("ARRAY IS :");
		for(String item:newlist)
		{
			System.out.print(item+", ");
		}
		

	}

}
