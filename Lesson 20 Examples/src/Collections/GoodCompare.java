/* Shows that the NewName class behaves properly
 * using overridden equals and hashCode methods.
 */
 
import personData.NewName;
import java.util.*;

public class GoodCompare {
  public static void main(String[] args) {
    NewName president = new NewName ("George", "Washington");
    NewName first = new NewName ("George", "Washington");
    System.out.println("Should be equal, and equals returns: " 
                                       + first.equals(president));
    System.out.print("The hash codes for first and president are: ");
    if (president.hashCode() == first.hashCode())
       System.out.println("equal");
    else
       System.out.println("not equal");
    Set s = new HashSet();
    s.add(president);
    System.out.println
       ("Should contain George Washington, and contains returns: "
                                               + s.contains(first));
    Map m = new HashMap();
    m.put(president, "first");
    System.out.println("Should get 'first', and get returns: " 
                                                   + m.get(first)); 
    System.out.println("toString overridden so first is: " + first);
  }
}