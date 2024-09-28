package Collections;
/*
How to Get Random Elements from Java HashSet?
Unlike List classes, the HashSet class does not provide any methods using which 
we can get the elements using their index. It makes it difficult to get random 
elements from it using the index.

We need to get random elements from HashSet, which can be done by either of the 
two ways:

1. By converting it to an array
2. Using an Iterator or a for loop
*/
import java.util.Collections; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RandomElementFromHashSet
{
    static int currentIndex = 0; 
    // generate a random number 
    static Random random = new Random(); 
    public static void main(String[] args)
    {
        // creating the HashSet 
        Set<String> hs = new HashSet<String>(); 
        hs.add("Alabama"); 
        hs.add("Delaware"); 
        hs.add("Montana"); 
        hs.add("California"); 
        hs.add("Washington"); 
        hs.add("Oregon"); 
        hs.add("Alaska"); 
        hs.add("Iowa"); 
        hs.add("Michigan"); 
  
        System.out.println("States hash set = " + hs);
        List list = new LinkedList();
        list.addAll(hs);
        Collections.shuffle(list);
        System.out.println("States list = " + list);
        
        // convert HashSet to an array: method 1
        String[] arrayNumbers = hs.toArray(new String[hs.size()]); 
  
        // this will generate a random number between 0 and  HashSet.size - 1 
        int randomNumber = random.nextInt(hs.size()); 
  
        // get the element at random number index 
        System.out.println("\nRandom element using array of numbers: " + 
            arrayNumbers[randomNumber] +  " at index = " + randomNumber); 
        
        System.out.println("\nRandom element using iterator: "
            + getRandomElement(hs) + " at index = " + currentIndex);
        
        //HashMap example
        Map<String, String> capitals = new HashMap<String, String>();
        capitals.put("Colorado","Denver");
        capitals.put("Maine","Augusta");
        capitals.put("Delaware","Dover");
        capitals.put("Oregon","Salem");
        capitals.put("Washington","Olympia");
        System.out.println("\nMap capitals = " + capitals);
        
        Set keys = capitals.keySet();
        System.out.println("keys = " + keys);
        list.removeAll(hs);
        list.addAll(keys);
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("list after shuffle = " + list);
        
        String randomState = list.get(0).toString();
        String randomCapital = capitals.get(randomState);
        System.out.println("randomState = " + randomState);
        System.out.println("randomCapital = " + randomCapital);
    }
    
    //alternative way to get a random element: method 2
    private static <E> E getRandomElement(Set<? extends E> set) 
    {        
        // Generate a random number using nextInt  method of the Random class. 
        int randomNumber = random.nextInt(set.size()); 
        Iterator<? extends E> iterator = set.iterator(); 
        E randomElement = null; 
  
        // iterate the HashSet 
        while (iterator.hasNext()) 
        { 
            randomElement = iterator.next(); 
            // if current index is equal to random number 
            if (currentIndex == randomNumber) 
                return randomElement; 
            // increase the current index 
            currentIndex++; 
        } 
        return randomElement; 
    } 
}
