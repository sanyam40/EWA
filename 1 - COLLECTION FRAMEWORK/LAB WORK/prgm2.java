
import java.util.*;

public class prgm2 {
	public static void main(String []args) {
		LinkedList<String> letters = new LinkedList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		
	
	ListIterator<String> iter = letters.listIterator();

	iter.next();
	System.out.println(letters);

	iter.next();
	System.out.println(letters);

	iter.remove();
	System.out.println(letters);

	iter.next();
	System.out.println(letters);

	iter.add("E");
	System.out.println(letters);

	iter.next();
	System.out.println(letters);

	iter.add("F");
	System.out.println(letters);

}
}
