package Lesson19;

// ListTest.java
// Class ListTest
public class ListTest
{
    public static void main( String args[] )
    {
        List objList = new List(); // create the List container
        // Create objects to store in the List
        Boolean b = Boolean.TRUE;
        //boolean another = false;
        Character c = '$';  //new Character( '$' );
        Integer i = 34567;  //new Integer( 34567 );
        String s = "hello";
        // Use the List insert methods
        objList.insertAtFront( b );
        //objList.insertAtFront( another );   //autoboxing done here
        objList.print();
        objList.insertAtFront( c );
        objList.print();
        objList.insertAtBack( i );
        objList.print();
        objList.insertAtBack( s );
        objList.print();
        // Use the List remove methods
        Object removedObj;
        try
        {
            removedObj = objList.removeFromBack();
            System.out.println(removedObj.toString() + " removed" );
            objList.print();
            removedObj = objList.removeFromFront();
            System.out.println(removedObj.toString() + " removed" );
            objList.print();
            removedObj = objList.removeFromFront();
            System.out.println(removedObj.toString() + " removed" );
            objList.print();            
            removedObj = objList.removeFromBack();
            System.out.println(removedObj.toString() + " removed" );
            objList.print();
             removedObj = objList.removeFromBack();
        }
        catch ( EmptyListException e )
        {
            System.err.println( "\n" + e.toString() );
        }
    }
}