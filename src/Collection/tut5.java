//QUEUE

package Collection;
import java.util.*;

public class tut5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		    System.out.println("enter the string: ");
			String s=sc.nextLine();
			Stack<Character> stack=new Stack<>();
			boolean isBalanced=true;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='(' || ch=='{' ||ch=='[')
				{
					stack.push(ch);
					continue;
				}
				
				if(ch=='(')
				{
					if(stack.peek()==')')
					{
						stack.pop();
					}
					else {
						isBalanced=false;
						break;
					}
					
						
				}
				if(ch=='{')
				{
					if(stack.peek()=='}')
					{
						stack.pop();
					}
					else {
						isBalanced=false;
						break;
					}
					
						
				}
				if(ch=='[')
				{
					if(stack.peek()==']')
					{
						stack.pop();
					}
					else {
						isBalanced=false;
						break;
					}
					
						
				}
				
				
			}
			
			if(isBalanced)
			{
				System.out.println("Balanced");
			}
			else
			{
				System.out.println("Not Balanced");
			}

//		sc.close();
		
		

	}

}
