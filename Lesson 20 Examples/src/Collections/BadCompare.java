package Collections;
/* Shows that the Name class does not behave properly
 * using inherited equals and hashCode methods.
 */
 
import personData.Name;
import java.util.*;

public class BadCompare {
  public static void main(String[] args) {
    Name president = new Name ("George", "Washington");
    Name first = new Name ("George", "Washington");
    System.out.println("Should be equal, but equals returns: " + first.equals(president));
    System.out.print("The hash codes for first and president are: ");
    if (president.hashCode() == first.hashCode())
       System.out.println("equal");
    else
       System.out.println("not equal");
    Set s = new HashSet(0);
    s.add(president);
    System.out.println("Should contain George Washington, but contains returns: "
                        + s.contains(first));
    Map m = new HashMap();
    m.put(president, "first");
    System.out.println("Should get 'first', but get returns: " + m.get(first)); 
    System.out.println("toString overridden so first is: " + first);
  }
}