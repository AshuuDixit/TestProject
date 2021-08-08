package Collection;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayList {

	public static void main(String[] args) {
	String[] str= {"ashu","is","my","name"};
	System.out.println("Array is:"+Arrays.toString(str)); 
	ArrayList<String> newlist=new ArrayList<>(Arrays.asList(str));
	System.out.println("Array List is"+newlist);
	
	
		

	}

}
