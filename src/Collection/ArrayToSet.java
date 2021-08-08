package Collection;

import java.util.*;

public class ArrayToSet {

	public static void main(String[] args) {
		String[] str= {"ashu ","is","my","name"};
		System.out.println("array is :"+Arrays.toString(str));
		Set<String> myset=new HashSet<String>(Arrays.asList(str));
		System.out.println(" set is : "+myset);

	}

}
