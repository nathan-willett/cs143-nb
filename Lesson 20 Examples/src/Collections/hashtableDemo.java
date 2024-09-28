// hashtableDemo.java
package Collections;
import java.util.*;

class hashtableDemo
{
    public static void main (String [] args)
    {
       String data;
       String msg;

       // Create a Hashtable object with an initial capacity of 20
       // buckets and a load factor of .75.

       Hashtable h = new Hashtable (20);

       System.out.println (h.put ("one", 1));
       System.out.println (h.put ("one", new Integer (1)));
       System.out.println (h.put ("name", "Nietzsche"));
       System.out.println (h.put ("date", new Date ()));
       System.out.println (h.put ("one", 4));
       System.out.println("Date's hash code = " + h.get("date").hashCode());
       System.out.println("Nietzsche's hash code = " + "Nietzsche".hashCode());
       System.out.println("Date's hash code = " + "date".hashCode());
       Date now = new Date();
       int dateIntegerValue = now.hashCode();
       System.out.println("Date's hash code = " + now.hashCode());
       System.out.println("Date's hash code = " + dateIntegerValue);
       // Output all keys.

       System.out.println ("\nOutputting keys...");
       Enumeration e = h.keys ();
       while (e.hasMoreElements ())
              System.out.println (e.nextElement ());

       // Output all values.

       System.out.println ("\nOutputting values...");
       e = h.elements ();
       while (e.hasMoreElements ())
          System.out.println (e.nextElement ());
    }
}
