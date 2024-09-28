package Collections;
import java.util.Iterator;
import java.util.*;
/**
   This program tests the hash set class.
*/
public class SetTest
{
   public static void main(String[] args)
   {
        //Set names = new TreeSet();        //
        Set names = new HashSet(23);         // 101 is a prime
        names.add("Sue");
        names.add("Harry");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
//        names.add("Adam");
//        names.add("Tony");
//        names.add("Katherine");
//        names.add("Juliet");
//        names.add("Romeo");
//        names.remove("Romeo");
        names.remove("George");

        Set names2 = new HashSet(23);
        names2.addAll(Arrays.asList(
        new String[]{"George", "Adam", "John", "Blake", "Sarah", "Michael", "Sue"}));
        
        Set union = new HashSet(53);
        union.addAll(names);
        union.addAll(names2);        

        Set intersection = new HashSet(23);
        intersection.addAll(names);
        intersection.retainAll(names2);
        
        Set difference = new HashSet(23);
        difference.addAll(names);
        difference.removeAll(names2);
        
        Iterator iter = names.iterator();
        while (iter.hasNext())
        {
            String obj = (String)iter.next();
           System.out.println(obj + "\t\t" + (obj.hashCode() & 0x7FFFFFFF));
        }
        
        System.out.println("The union of the two sets is " + union);
        System.out.println("The intersection of the two sets is " + intersection);
        System.out.println("The difference of the two sets is " + difference);
   }
}
