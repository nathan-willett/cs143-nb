//Copyright (c) 1998, Arthur Gittleman
//This example is provided WITHOUT ANY WARRANTY either expressed or implied.

/* Groups fields for a name.     
 * Uses toString to display.
 */

package personData;

public class Name 
{
  String first;
  char initial;
  String last;
          
  public Name(String f, String l) 
  {
    first = f; 
    last = l; 
  }
  public Name(String f, char i, String l) 
  {
    this(f,l);
    initial = i;  
  } 
  public String toString() 
  {
    if (initial == '\u0000')
       return first + " " + last;
    else  
       return first + " " + initial + " " + last;
  }
}
