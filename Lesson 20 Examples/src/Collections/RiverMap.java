package Collections;
/* Illustrates Map methods 
 */
import java.util.*;
public class RiverMap 
{
  public static void main(String[] args) 
  {
    Map rivers = new HashMap(37);
    
    String[] names = {"Amazon", "Chang", "Colorado", "Columbia",    
                      "Congo", "Danube", "Euphrates", "Ganges", 
                      "Huang", "Indus", "Mekong", "Mississippi",
                      "Missouri", "Niger", "Nile", "Rio Grande", 
                      "Volga"}; 
    int[] lengths = {4000,3964,1450,1243,2718,1776,1700,1560,3395,
                     1800,2600,2340,2315,2590,4160,1900,2290};
    for (int i = 0; i < names.length; i++)
         rivers.put(names[i], new Integer(lengths[i]));
    System.out.println("The size of the rivers map is: " 
         + rivers.size());
    System.out.println("Rivers map contains key 'Congo': " 
         + rivers.containsKey("Congo"));
    System.out.println("Rivers map contains value 3500: " 
                      + rivers.containsValue(new Integer(3500)));
    System.out.println();
    System.out.println(rivers.keySet());
    System.out.println();
    System.out.println();
    System.out.println(rivers);
    
    Map riversTree = new TreeMap();
    riversTree.putAll(rivers);
    System.out.println();
    System.out.println(riversTree);
    System.out.println();
    for (Iterator i = rivers.entrySet().iterator(); i.hasNext(); ) 
    {
      Map.Entry item = (Map.Entry)i.next();
      int size = ((Integer)item.getValue()).intValue();
      if (size >= 3000)
         System.out.println("\t" + item.getKey() + '\t' + size);
    }
    long starttime = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++)
      rivers.get("Columbia");
    long stoptime = System.currentTimeMillis();
    System.out.println("Time for 100000 gets in a hash map is " 
        + (stoptime-starttime));
    starttime = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++)
      riversTree.get("Columbia");
    stoptime = System.currentTimeMillis();
    System.out.println("Time for 100000 gets in a tree map is " 
        + (stoptime-starttime));
  }
}                     
                        
