/* Enters 12 identifiers in a hash table. 
 */
package Collections;
import java.util.*;

public class HashPut 
{
  public static void main(String[] args) 
  {
    String[] identifiers =
       {"sum","average","count","number","name","address","repeat",
        "line","background","g","print","text"}; 
    String[] types = {"int","double","int","int","String","String",
        "char","String","Color","Graphics","Button","TextField"}; 
    Hashtable table = new Hashtable(23);
    for(int i = 0; i < identifiers.length; i++) 
      table.put(identifiers[i], types[i]);
    System.out.println("The type of background is " + 
                                table.get("background"));
    System.out.println("\nThe keys are:");
    Enumeration e = table.keys();
    Collection values = table.values();
    while (e.hasMoreElements()){
      System.out.print(e.nextElement());
      System.out.print(' ');
    }
    Iterator setIterator =  values.iterator();
    System.out.println("\n\nThe values are:");
    while(setIterator.hasNext()) 
    {
        String next = (String)setIterator.next();
        System.out.print(next + ' ');
    }
   }
}
