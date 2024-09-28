package Collections;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
   This program tests a map that maps names to colors.
*/
public class MapTest
{
   public static void main(String[] args)
   {
      
        Map favoriteColors = new HashMap();
        //Map favoriteColors = new TreeMap();     //ordered
        favoriteColors.put("Juliet", Color.pink);
        favoriteColors.put("Romeo", Color.green);
        favoriteColors.put("Adam", Color.blue);
        favoriteColors.put("Eve", Color.pink);
        favoriteColors.put("Eve", Color.MAGENTA);
        favoriteColors.put("Peter Bunny", Color.ORANGE);
        System.out.println("The HashMap has: " + favoriteColors);
        print(favoriteColors);
   }

   /**
      Prints the contents of a map
      @param m a map
   */
   private static void print(Map m)
   {
      Set keySet = m.keySet();
      Iterator iter = keySet.iterator();
      while (iter.hasNext())
      {
         Object key = iter.next();
         Object value = m.get(key);
         System.out.println(key + "->" + value);
      }
      System.out.println( "size: " + m.size() );
   }
}
