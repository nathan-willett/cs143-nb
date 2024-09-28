package Collections;
import java.util.HashSet;
import java.util.Arrays;

public class SetOperations
{
    public static void main(String[] args)
    {
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(
        new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        System.out.println("set1 = " + set1);
        
        HashSet<String> set1Clone1 = (HashSet<String>)set1.clone();
        HashSet<String> set1Clone2 = (HashSet<String>)set1.clone();

        HashSet<String> set2 = new java.util.HashSet<String>(Arrays.asList(
          new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
        System.out.println("set2 = " + set2);
        
        set1.addAll(set2);          //set1 is modified, that's why you need a copy
        set1Clone1.removeAll(set2); //set1Clone1 is modified
        set1Clone2.retainAll(set2);
        
        System.out.println("The union of the two sets is " + set1);
        System.out.println("The difference of the two sets is " + set1Clone1);
        System.out.println("The intersection of the two sets is " + set1Clone2);
    }
    
}
