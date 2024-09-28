package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
   A program to test hash codes of coins
*/
public class HashCodeTest
{
   public static void main(String[] args)
   {
      Coin coin1 = new Coin(0.25, "quarter");
      Coin coin2 = new Coin(0.25, "quarter");
      Coin coin3 = new Coin(0.05, "nickel");

      System.out.println("hash code of coin1=" 
         + coin1.hashCode());
      System.out.println("hash code of coin2=" 
         + coin2.hashCode());
      System.out.println("hash code of coin3=" 
         + coin3.hashCode());

      Set coins = new HashSet();
      coins.add(coin1);
      coins.add(coin2);
      coins.add(coin3);
      coins.add(coin3);
      coins.add(coin3);

      Iterator iter = coins.iterator();
      while (iter.hasNext())
         System.out.println(iter.next());
   }
}
