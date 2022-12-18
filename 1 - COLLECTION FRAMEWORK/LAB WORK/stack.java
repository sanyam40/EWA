package arraylist;
import java.util.*;

public class stack {

			

			    public static void main (String[] args) {
			     Stack<String> S1 = new Stack<String>();
			     String Sarray[];
			     String s = "marry had a little lamb, Its fleece was white as snow";
			     System.out.println(S1);
			     Sarray = s.split("marry");
			     System.out.println(Sarray[0]);
			     System.out.println(Sarray.length);
			     for(int i = 0; i<Sarray.length; i++){
			         S1.push(Sarray[i]);
			     }
			     for(int i = 0; i<Sarray.length; i++) {
			         System.out.println(S1.pop());
			     }
			   }
			}


