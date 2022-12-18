package arraylist;
import java.util.*;

public class Abc {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(78);
		stack.push(89);
		stack.push(98);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int x=stack.peek();
		System.out.println(x);
		System.out.println(stack.size());
		stack.clear();
		System.out.println(stack);
		
		Queue<Integer>sa=new LinkedList<Integer>();
		for (int i = 0; i < 5; i++)
            sa.add(i);
		System.out.println(sa);
		sa.remove();
		System.out.println(sa);
		int head = sa.peek();
		System.out.println(head);
		System.out.println(sa.size());
		sa.clear();
		System.out.println(sa);
		
		
		
		

	}

}
