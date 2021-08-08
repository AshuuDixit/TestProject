//STACK

package Collection;
import java.util.*;
public class tut4 {

	public static void main(String[] args) {
//		Vector<Integer> v=new Vector<>();
//		v.add(2);
//		v.add(66);

		Stack<Integer> stack=new Stack();
		stack.push(12);
		stack.push(33);
		stack.push(46);
		int popped=stack.pop();
		System.out.println(popped);
		popped=stack.pop();
		
		System.out.println(popped);
		int peeked=stack.peek();
		System.out.println(peeked);
		int searched=stack.search(22);
		System.out.println(searched);
		System.out.println(stack.empty());
	}

}
