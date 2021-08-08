package Collection;
import java.util.*;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "ashu");
		map.put(2, "ayush");
		map.put(3, "mummy");
		map.put(4, "papa");
		System.out.println(" map is : "+map);
		List<Integer> listint=new ArrayList<Integer>(map.keySet());
		List<String> liststr=new ArrayList<String>(map.values());
		System.out.println(" List of integer is :"+listint);
		System.out.println(" List of string is :"+liststr);
		
		

	}

}
