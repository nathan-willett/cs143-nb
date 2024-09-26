package Lesson19;

// StackTest.java
// Class StackTest
public class StackTest
{
    public static void main( String args[] )
    {
        StackInheritance objStack = new StackInheritance();
        //StackComposition objStack = new StackComposition();
        // Create objects to store in the stack
        Boolean b = Boolean.TRUE;
        Character c = '$';
        Integer i = 34567;
        String s = "hello";
        // Use the push method
        objStack.push( b );
        objStack.print();
        objStack.push( c );
        objStack.print();
        objStack.push( i );
        objStack.print();
        objStack.push( s );
        objStack.print();
        // Use the pop method
        Object removedObj = null;
        try
        {

            while ( !objStack.isEmpty() )
            {
                removedObj = objStack.pop();
                System.out.println( removedObj.toString() + " popped" );
                objStack.print();
            }
        }
        catch ( EmptyListException e )
        {
            System.err.println( "\n" + e.toString() );
        }
    }
}