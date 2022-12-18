
import java.util.*;

public class prgm1 {

	public static void main(String[] args) {
		LinkedList<String> staff = new LinkedList<>();
		ListIterator<String> iterator = staff.listIterator();
		iterator.add("Tom");
		System.out.println(staff);
		iterator.add("Dianaz");
		System.out.println(staff);
		iterator.add("Harry");
		System.out.println(staff);
		iterator = staff.listIterator();
		if(iterator.next().equals("Tom"))
		{
		    iterator.remove();
		    System.out.println(staff);
		    
		}
		while(iterator.hasNext()){
		    System.out.println(iterator.next());
		}

	}

}
