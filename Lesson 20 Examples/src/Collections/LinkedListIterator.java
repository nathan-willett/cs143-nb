/* Illustrates List and ListIterator methods.
 */
package Collections;
import java.util.*;
import java.awt.Point;

public class LinkedListIterator 
{
    public static void main(String[] args) 
    {
        List linkImp = new LinkedList();
        Date today = new Date();
        long time1, time2;
        for(int i = 0; i < 10000; i++)
           linkImp.add(today);
        ListIterator iterator = linkImp.listIterator(50);
        System.out.println("Current index is " + (iterator.previousIndex() + 1));
        System.out.println("Previous index is " + iterator.previousIndex());
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
           iterator.add(today);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 10000 adds at position 50: " + (time2 - time1));
        int previousIndex = iterator.previousIndex();
        System.out.println("Previous index is " + previousIndex);
        System.out.println("Previous item is: " + iterator.previous());
        Point point = new Point(5,7);
        iterator.set(point);
        System.out.println("The item at the previous index is now: " 
                           + linkImp.get(previousIndex));
        System.out.println("Next index is " + iterator.nextIndex());
        List threeItems = linkImp.subList(10048,10051);
        System.out.println("The sublist in reverse is:");
        for (ListIterator i = threeItems.listIterator(threeItems.size()); i.hasPrevious();)
           System.out.println("\t" + i.previous());
        threeItems.set(0, new Point(3,4));
        System.out.println("Changing threeItems(0) changes linkImp(10048) to:");
        System.out.println("\t" + linkImp.get(10048));
    }
}