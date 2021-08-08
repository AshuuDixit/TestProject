package Collection;
import java.util.ArrayList;
public class tut1 {

	public static void main(String[] args) {
		ArrayList arrayList =new ArrayList<>();
		arrayList.add(1);
		arrayList.add("ashu");
		System.out.println(arrayList);
		ArrayList<Integer> arrayList1 =new ArrayList<>();
		arrayList1.add(55);
		System.out.println(arrayList1);
		pair<String,Integer>p1=new pair<>("ashu",44);
		pair<Boolean,Double>p2=new pair<>(true,44.7474664);
		p1.getDescription();
		p2.getDescription();
		

	}

}
