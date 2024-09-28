/* Compares the efficiency of the hash map
 * implementation with the tree map.
 */
package Collections;
import java.util.*;

public class CompareMaps 
{
  public static final int MAX  = 500000000;
  public static final Integer TEST = new Integer(100000);

  public static String time(Map map, Integer test) 
  {
    Object value = null;
    long starttime = System.currentTimeMillis();
      for (int i = 0; i < MAX; i++) 
      {
        value = map.get(test);
      } 
    long stoptime = System.currentTimeMillis();
    return (value + " took " + (stoptime - starttime));
  }          
  public static void main(String[] args) 
  {
    int SIZE = 20;     //Integer.parseInt(args[0]);
    Map hash = new HashMap(2*SIZE);
    Map tree = new TreeMap();
    Random random = new Random();
    Integer i = new Integer(random.nextInt(5000000));
    for (int j = 0; j < SIZE; j++) 
    {
       hash.put(i, i);
       tree.put(i, i);
    }
    System.out.println("Hash for " + time(hash, TEST));
    System.out.println("Tree for " + time(tree, TEST));
  }
}
    