
-- Comparable interface -- 

• The standard way for a Java class to define a comparison 
function for its objects is to implement the  Comparable 
interface.

public interface Comparable<T> {
     public int compareTo(T other);
}

• A call of  A.compareTo(B)  should return:
•  a value <  0 if A comes "before" B in the ordering,
•  a value > 0 if A comes "after" B in the ordering,
•  or exactly 0 if A and B are considered "equal" in the ordering.

1)Comparable interface is present in java.lang package.
2)Sort the elements according to natural sorting order.
3)It contains only one method i.e., compareTo().
4)Class itself implements Comparable interface.
5)We can sort the list elements of Comparable type by Collections.sort(List) method.
6)mplemented frequently in the APIs by: String, Wrapper classes, Date,Calendar.


-- Comparator Interface -- 

• Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class
•  We create multiple separate classes (that implement Comparator) to compare by different members.

  public interface Comparator<T> {
     public int compare(T first, T second);
}

•  Interface Comparator is an external object that specifies a comparison function over some other type of objects
•  Allows you to define multiple orderings for the same type
•   Allows you to define a specific ordering for a type even if there is no obvious "natural" ordering for that type.

1)Comparator interface is present in java.util package.
2)Sort the elements according to customized sorting order.
3)It contains two methods compare() and equals().
4)External class implements the Comparator interface.
5)We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.
6)Meant to be implemented to sort instances of third-party classes.

