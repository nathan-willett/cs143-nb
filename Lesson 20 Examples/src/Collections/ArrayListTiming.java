package Collections;
/* Checks time needed for list operations
 * using an ArrayList implementation.
 */

import java.util.*;

public class ArrayListTiming 
{
    public static void main(String[] args) 
    {
        List arrayImp = new ArrayList();
        HashSet hashset = new HashSet(100001);
        Hashtable hash = new Hashtable (200001);
        Date today = new Date();
        long time1, time2;
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
           arrayImp.add(today);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 100000 ArrayList adds: " + (time2 - time1));
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
           arrayImp.add(50, today);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 100000 adds at position 50: " + (time2 - time1));
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
           arrayImp.get(5000);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 100000 ArrayList gets at position 5000: " + (time2 - time1));
        //System.out.println("time2 = " + time2);
        
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
           hash.put(i, today);
          //hashset.add(today);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 100000 adds in hash table: " + (time2 - time1));
        
        time1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++)
           hash.get(5000);
            //hashset.contains(today);
        time2 = System.currentTimeMillis();
        System.out.println("Time for 100000 hash gets at position 5000: " + (time2 - time1));
        //System.out.println("time2 = " + time2);
    }
}