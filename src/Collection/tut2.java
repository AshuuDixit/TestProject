//methods of ArrayList
	package Collection;
	import java.util.ArrayList;
import java.util.List;
	public class tut2 {
		public static void main(String[] args) {
			
//			add()
			
		ArrayList arrayList =new ArrayList<>();
//		prefer below
//		List arrayList=new ArrayList<>();
			arrayList.add(1);
			arrayList.add("ashu");
			System.out.println(arrayList);
			
		ArrayList arrayList1 =new ArrayList<>();
		arrayList1.add(5);
		arrayList1.add("ayush");
		arrayList1.add("ashu");
		System.out.println(arrayList1);
		
		
		List<String> fruits =new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		System.out.println(fruits);
		
		List <String>vegetables =new ArrayList<>();
		vegetables.add("apple");
		vegetables.add("orange");
		vegetables.add("chilli");
		System.out.println(vegetables);
//		
//		addAll()
		arrayList.addAll(arrayList1);
		System.out.println(arrayList);
		
//		get()
		System.out.println(arrayList.get(0));
		System.out.println(arrayList1.get(1));
		
//		set()
		arrayList.set(0, "mummy");
		System.out.println(arrayList);
		
//		remove()
		arrayList.remove(0);
		System.out.println(arrayList);
		
//		removeAll
		fruits.removeAll(vegetables);
		System.out.println(fruits);
//		
//		clear()
		arrayList.clear();
		System.out.println(arrayList);
		
//		size()
		System.out.println(vegetables.size());
		
//		contains()
		System.out.println(vegetables.contains("Apple"));
		
//		isEmpty()
		System.out.println(arrayList.isEmpty());
		
//		toArray()
		
		String temp[]=new String[vegetables.size()];
		vegetables.toArray(temp);
		for(String e:temp)
			System.out.println(e);
		


		

	}

}
