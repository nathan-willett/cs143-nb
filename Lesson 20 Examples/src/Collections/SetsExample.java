package Collections;

import java.util.*;

/** A class to demonstrate the use of the Set
  * and SortedSet interfaces in the java.util package
  */
public class SetsExample 
{
   /** Test method for the class
     * @param args not used
     */
   public static void main( String[] args ) {
      // create a set and intialize it
      Set s1 = new LinkedHashSet();
      s1.add(6);
      s1.add( new Integer( 100 ) );
      s1.add( new Integer( -89 ) );
      s1.add( new Integer( 2 ) );
      s1.add( new Integer( 6 ) );       //sets have no duplicates
      s1.add( new Integer( 57 ) );
      boolean isAdded = s1.add( new Integer( 2 ) );
       System.out.println("isAdded = " + isAdded);
      
      // iterate to display the set values
      // set iterator does not visit elements in the order inserted
      Iterator i1 = s1.iterator();
      while ( i1.hasNext() ) {
         System.out.print( i1.next() + "  " );
      }
      System.out.println();
      
      // create a sorted Set from a Set
      SortedSet s2 = new TreeSet( s1 );           // elements in TreeSet are sorted
      // iterate to display the set values
      Iterator i2 = s2.iterator();
      while ( i2.hasNext() ) 
      {
         System.out.print( i2.next() + "  " );
      }
      System.out.println("\nSize of set = " + s1.size());
      s1.remove(6);
      System.out.println(s1);
   }
}