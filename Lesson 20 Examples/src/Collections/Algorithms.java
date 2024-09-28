package Collections;
/* Illustrates algorithms in the Collections class.
 */

import java.util.*;

public class Algorithms 
{
  public static void main(String[] args) 
  {
        String[] words = {"sat","tat","hat","fat","vat", 
                          "cat","rat","bat","mat","oat","pat", "pat"};
        List list = new ArrayList();
        for (int i = 0; i < words.length; i++)
           list.add(words[i]);
        Collections.reverse(list);
        System.out.println("Reverse of list is: " + list);
        System.out.println("Max is: " + Collections.max(list));
        System.out.println("Min is: " + Collections.min(list));
        Collections.sort(list);
        System.out.println("Sorted list is: " + list);
        System.out.println("Index of rat is: " 
                       + Collections.binarySearch(list, "rat"));
        System.out.println("Searching for potato returns: " 
                       + Collections.binarySearch(list, "potato"));
        Collections.shuffle(list);
        System.out.println("Shuffled list is: " + list);

        Collections.copy(list,list.subList(5,8));
        System.out.println("List changed at indices 0-2 is:\n\t " + list);
        Collections.fill(list.subList(0,3),"fill");
        System.out.println("List filled at indices 0-2 is:\n\t " + list);
        System.out.println("List with 5 fives is: " 
                                  + Collections.nCopies(5,"five"));
        Collections.addAll(list, "mad");
        System.out.println("list = " + list);
        
  }
}