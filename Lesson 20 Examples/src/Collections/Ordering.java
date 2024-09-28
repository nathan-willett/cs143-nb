/* Illustrates the SortedSet interface
 */
package Collections;
import java.util.*;
import personData.*;

public class Ordering 
{
    public static void main(String[] args) 
    {
        SortedSet set = new TreeSet();
        NewOrderedName jackson, madison;
        set.add(new NewOrderedName("George", "Washington"));
        set.add(new NewOrderedName("John", "Adams"));
        set.add(new NewOrderedName("Thomas", "Jefferson"));
        set.add(madison = new NewOrderedName("James", "Madison"));
        set.add(new NewOrderedName("James", "Monroe"));
        set.add(new NewOrderedName("John", 'Q', "Adams"));
        set.add(jackson = new NewOrderedName("Andrew", "Jackson"));
        set.add(new NewOrderedName("Martin", "Van Buren"));
        set.add(new NewOrderedName("William", 'H', "Harrison"));
        set.add(new NewOrderedName("James", 'K', "Polk"));
        System.out.println("The set consists of: " + set);
        System.out.println("The first element is: " + set.first());
        System.out.println("The last element is: " + set.last());
        System.out.println("The J's are: " + set.subSet(jackson, madison));
        System.out.println("A-I are: " + set.headSet(jackson));
        System.out.println("M-Z are: " + set.tailSet(madison));
    }
}
    