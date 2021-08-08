package Collection;
import java.util.*;
public class SetToARRAY {

	public static void main(String[] args) {
	Set<String> myset=new HashSet<String>();
	myset.add("ashu");
	myset.add("is");
	myset.add("my");
	myset.add("name");
	System.out.println("Set is :"+myset);
	String[] str=new String[myset.size()];
	myset.toArray(str);
	System.out.println("Array is :"+myset);
	
	

	}

}
