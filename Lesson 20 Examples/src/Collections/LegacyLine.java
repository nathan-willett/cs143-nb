package Collections;

import java.util.Vector;
import java.util.Enumeration;
import java.io.PrintStream;
import java.awt.Point;

/** A class to demonstrate the use of the Vector and
  * Enumeration classes in the java.util package
  */
public class LegacyLine 
{
   private Vector points = new Vector();

   /** Set the starting point for a line
     * @param p the starting point
     */
   public void setStart( Point p ) 
   {
      points.removeAllElements();
      points.addElement( p );
   }

   /** Set the next point in a line
     * @param p the next point
     */
   public void addPoint( Point p ) 
   {
      points.addElement( p );
   }

   /** Print all the points in a line
     * @param ps the stream where the points
     *           will be printed
     */
   public void listPoints( PrintStream ps ) 
   {
      Enumeration e = points.elements();
      while ( e.hasMoreElements() ) 
      {
         ps.println( e.nextElement() );
      }
   }

   /** Test method for the class
     * @param args not used
     */
   public static void main( String[] args ) 
   {
      LegacyLine x = new LegacyLine();
      x.setStart( new Point( 4, 11 ) );
      x.addPoint( new Point( -6, 1 ) );
      x.addPoint( new Point( 2, 3 ) );
      x.listPoints( System.out );
   }
}