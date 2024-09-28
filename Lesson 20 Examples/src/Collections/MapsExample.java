package Collections;

import java.util.*;

/** A class to demonstrate the use of the Map
  * and SortedMap interfaces in the java.util package
  */
public class MapsExample 
{
   /** Test method for the class
     * @param args not used
     */
   public static void main( String[] args ) 
   {
      // create a map and intialize it
      Map m1 = new HashMap();
      m1.put( "height", new Integer( 72 ) );
      m1.put( "weight", new Integer( 180 ) );
      m1.put( "age", new Integer( 21 ) );
      m1.put( "shoe", new Integer( 11 ) );
      m1.put( "sleeve", new Integer( 35 ) );

      // get a view of the map as a set
      Set s1 = m1.entrySet();
      // iterate to display the set values
      Iterator i1 = s1.iterator();
      while ( i1.hasNext() ) 
      {
         Map.Entry me = (Map.Entry) i1.next();
         System.out.print( me.getKey() + ":"
                           + me.getValue() + " " );
      }
      System.out.println();

      // use an anonymous inner class to define the
      // Comparator for the SortedMap
      SortedMap m2 = new TreeMap( new Comparator() 
      {
         @Override
         public int compare( Object o1, Object o2 ) 
         {
               // reverse the natural ordering
               Comparable c1 = (Comparable)o1;
               Comparable c2 = (Comparable)o2;
               return -( c1.compareTo( c2 ) );
          }
      }
      );
      m2.putAll( m1 );

      // get a view of the map as a set
      Set s2 = m2.entrySet();
      
      // iterate to display the set values
      Iterator i2 = s2.iterator();
      while ( i2.hasNext() ) 
      {
         Map.Entry me = (Map.Entry) i2.next();
         System.out.print( me.getKey() + ":"
                           + me.getValue() + " " );
      }
      System.out.println();
   }
}