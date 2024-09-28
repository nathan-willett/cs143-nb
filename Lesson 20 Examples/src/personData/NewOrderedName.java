//Copyright (c) 1999, Art Gittleman
//This example is provided WITHOUT ANY WARRANTY either expressed or implied.

/* Groups fields for a name. Overrides NewName and    
 * implements the Comparable interface.
 */

package personData;

public class NewOrderedName extends NewName implements Comparable 
{
          
  public NewOrderedName(String f, String l) 
  {
    super(f,l);
  }
  public NewOrderedName(String f, char i, String l) 
  {
    super(f,i,l);
  } 
  @Override
  public int compareTo(Object object) 
  {
    NewOrderedName name = (NewOrderedName)object;
    int lastResult = last.compareTo(name.last);
    if (lastResult != 0)
      return lastResult;
    else {
      int firstResult = first.compareTo(name.first);
      if (firstResult != 0)
         return firstResult;
      else
         return (int)initial - (int)name.initial;
    }
  }
  public static void main(String[] args) 
  {
    NewOrderedName jAdams = new NewOrderedName("John", "Adams");
    NewOrderedName jqAdams = new NewOrderedName("John", 'Q', "Adams");
    NewOrderedName hAdams = new NewOrderedName("Henry", "Adams");
    System.out.println("jAdams vs. jqAdams " + jAdams.compareTo(jqAdams)); 
    System.out.println("jAdams vs. hAdams " + jAdams.compareTo(hAdams)); 
    System.out.println("hAdams vs. hAdams " + hAdams.compareTo(hAdams)); 
    //System.out.println(jAdams.compareTo("John Adams"));     //run-time error
  }
}
   
