/* Illustrates the methods of the Set interface.
 */
package Collections;
import java.util.*;
import java.io.*;

public class SetMethods {
  public static void main(String[ ] args) {
    try {
        String fileName = "src/Collections/Shakespeare.txt";
       File f = new File(fileName);
       BufferedReader in = new BufferedReader(new FileReader(f));
       Set set = new HashSet(11);
       String line;
       while((line = in.readLine()) != null) {
         StringTokenizer tokens = new StringTokenizer(line,"-,. \n\r\t");
         while(tokens.hasMoreTokens()) {
           String tok = tokens.nextToken().toLowerCase(); 
           set.add(tok);
         }
       }
       System.out.println("Contains \"fourscore\"? " + set.contains("fourscore"));
       System.out.println("Contains \"computer\"? " + set.contains("computer"));
       Collection start = new HashSet(13);
       start.add("fourscore");
       start.add("and");
       start.add("seven");
       start.add("years");
       System.out.println("Contains \"fourscore, and, seven, years\" ? " 
            + set.containsAll(start));
       Set newStart = new HashSet(13);
       newStart.addAll(start);
       System.out.println("newStart equals start? " + newStart.equals(start)); 
       newStart.add("computer");
       System.out.println
           ("newStart with \"computer\" equals start? " + newStart.equals(start)); 
       System.out.println("The newStart set is now " + newStart);
       newStart.retainAll(set);
       System.out.println
           ("newStart equals start after retainsAll? " + newStart.equals(start)); 
       Object[] startArray = start.toArray();
       System.out.print("The start array is now: ");
       for (int i = 0; i < startArray.length; i++)
          System.out.print(startArray[i] + " ");
       System.out.println();
       start.add(new Integer(5));
       start.add(new Double(Math.PI));
       startArray = start.toArray();
       System.out.print("The start array is now: ");
       for (int i = 0; i < startArray.length; i++)
          System.out.print(startArray[i] + " ");
       System.out.println();
       System.out.println("Removing pi worked? " + start.remove(new Double(Math.PI)));
       System.out.println("The start set is now " + start);
       System.out.println("Removing newStart elements from start worked? "
                           + start.removeAll(newStart));
       System.out.println("The start set is now " + start);
       Iterator setIterator =  set.iterator();
       while(setIterator.hasNext()) {
          String next = (String)setIterator.next();
          if (next.length() < 8)
               setIterator.remove();
       } 
       System.out.println("The long words of " + fileName + " are: " + set); 
     }catch(IOException e) {
         e.printStackTrace();
     }
  }
}
  