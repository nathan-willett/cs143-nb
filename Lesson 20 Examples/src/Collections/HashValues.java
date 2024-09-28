/* Computes the hash values of 12 identifiers, and
 * the index of each in a table of size 23.
 */
package Collections;
public class HashValues {
  public static void main(String[] args) {
    String[] identifiers =
       {"sum","average","count","number","name","address","repeat",
        "line","background","g","print","text"};   
    String spaces = "                              ";
    for(int i = 0; i < identifiers.length; i++) {
      String id = identifiers[i];
      int hash = id.hashCode();
      int code = hash % 23;
      if (code < 0) code += 23;
      System.out.println(id + spaces.substring(0,20-id.length())
        + hash + spaces.substring(0,20-String.valueOf(hash).length())
        + code);
    }
  }
}
