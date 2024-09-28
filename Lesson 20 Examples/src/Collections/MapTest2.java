package Collections;
// MapTest.java
 // Using a HashMap to store the number of words that
 // begin with a given letter
 import java.util.*;
 
 public class MapTest2 
 {
    private static  String names[] = { "one", "two", "three",
                                   "four", "five", "six",
                                   "seven", "two", "ten", "four" };
                   
    public MapTest2()
    {
       HashMap m = new HashMap();
       Integer i;
 
       for ( int k = 0; k < names.length; k++ ) 
       {
          i = ( Integer ) m.get( new Character(
                                 names[ k ].charAt( 0 ) ) );
 
          // if key is not in map then give it value one
          // otherwise increment its value by 1
          if ( i == null )
             m.put( new Character( names[ k ].charAt( 0 ) ),
                    new Integer( 1 ) );
          else
             m.put( new Character( names[ k ].charAt( 0 ) ),
                    new Integer( i.intValue() + 1 ) );
       }
 
       System.out.print( "\nnumber of words beginning with "
                         + "each letter:    " );
       printMap( m );
    }
 
    public void printMap( Map mapRef )
    {
       System.out.println( mapRef.toString() );
       System.out.println( "size: " + mapRef.size() );
       System.out.println( "isEmpty: " + mapRef.isEmpty() );         
    }                                                    
 
    public static void main( String args[] )
    {
       new MapTest2();
    }                                           
 }
