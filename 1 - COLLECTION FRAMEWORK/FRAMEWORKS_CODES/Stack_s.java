//The Stack class represents a last-in-first-out (LIFO) stack of objects.
import java.util.*;

public class Stack_s{
    public static void main(String[] args) {
        Stack<String>stack=new Stack<String>();
        // ADDING ELEMENTS
        stack.push("SANYAM");
        stack.push("SAHIL");
        stack.push("MILIT");
        stack.push("ARPITA");
        stack.push("TANYA");
        System.out.println(stack);
        // ACESSIGN THE LAST ELEMENT
        System.out.println("Top element in stack: "+stack.peek());

        // REMOVING THE ELEMENT
        System.out.println("Element deleted from stack is: "+stack.pop());
        stack.push("TANYA");

        //SEARCHING FOR A ELEMENT
		System.out.println("Position of element is: "+stack.search(80));
		System.out.println("Updated stack is: "+stack);

        // CHECKING IF STACK IS EMPTY OR NOT
		System.out.println("Stack is empty: "+stack.empty());
		System.out.println("======Traversing a Stack======");
		for(String in : stack) {
			System.out.println(in);
		}
		System.out.println("elements: "+stack);
	}
}
