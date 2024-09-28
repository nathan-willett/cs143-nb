//Copyright (c) 1998, Arthur Gittleman
//This example is provided WITHOUT ANY WARRANTY either expressed or implied.

/* Groups fields for a name. Overrides equals, hashValue,     
 * and toString.
 */

package personData;

public class NewName extends Name 
{
          
  public NewName(String f, String l) 
  {
    super(f,l);
  }
  public NewName(String f, char i, String l) 
  {
    super(f,i,l);
  } 
  public boolean equals(Object object) 
  {
    if (!(object instanceof NewName))
       return false;
    NewName name = (NewName)object;
    return first.equals(name.first) && initial == name.initial
             && last.equals(name.last);
  }
  public int hashCode() 
  {
    return first.hashCode() + (int)initial + last.hashCode();
  }
}
   
