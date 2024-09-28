package BookProgrammingExercises;
import java.util.*;

public class Exercise21_06 
{
  public static void main(String[] args) 
  {
    // Create a tree map to hold words and key and count as value
    TreeMap treeMap = new TreeMap();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter integers (end on 0): ");
    int number = input.nextInt();
    
    while (number != 0) 
    {     
      int key = number;

      if (treeMap.get(key) != null) 
      {
        int value = ((Integer)treeMap.get(key)).intValue();
        value++;
        treeMap.put(key, new Integer(value));
      }
      else {
        treeMap.put(key, new Integer(1));
      }
      number = input.nextInt();
    }

    Integer max = (Integer) Collections.max(treeMap.values());
    Set<Integer> keys = treeMap.keySet();
    Iterator<Integer> iterator = keys.iterator();

    while (iterator.hasNext()) {
      Object key = iterator.next();
      Integer value = (Integer)(treeMap.get(key));
      if (value.equals(max)) {
        System.out.println("Number " + key + " occurred most: " + max + " times.");
      }
    }
  }
}
