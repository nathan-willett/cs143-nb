/* Adds the words of the Shakespeare's "Friends, Romans, countrymen" to a set, 
 * counting the number of duplicates and listing the unique words.
 */
package Collections;
import java.util.*;
import java.io.*;

public class WordsSet 
{
  public static void main(String[ ] args) 
  {
    try 
    {
       //File f = new File(args[0]);
        String fileName = "src/Collections/Shakespeare.txt";
        File f = new File(fileName);
       BufferedReader in = new BufferedReader(new FileReader(f));
       Set set = new TreeSet();     //new HashSet(101);
       String line;
       int duplicates = 0;
       while((line = in.readLine()) != null) 
       {
            StringTokenizer tokens = new StringTokenizer(line, "-,. \n\r\t");
            while(tokens.hasMoreTokens()) 
            {
              String tok = tokens.nextToken().toLowerCase(); 
              if (!set.add(tok))
                 duplicates++;  
            }
       }
       //String s =((Collection) set).toString();
       System.out.println
          (fileName + " has " + set.size() + " distinct words.");
       System.out.println
          ("There are " + duplicates + " duplicate words.");
       System.out.println("The distinct words are:");
       System.out.println(set);
     }
     catch(IOException e) 
     {
         e.printStackTrace();
     }
  }
}
  