package Lesson19;
// QueueTest.java
public class QueueTest
{
    public static void main( String args[] )
    {
        //QueueInheritance objQueue = new QueueInheritance();
        QueueComposition objQueue = new QueueComposition();
        // Create objects to store in the queue
        Boolean b = Boolean.TRUE;
        Character c = '$';
        Integer i = 34567;
        String s = "hello";
        // Use the enqueue method
        objQueue.enqueue( b );
        objQueue.print();
        objQueue.enqueue( c );
        objQueue.print();
        objQueue.enqueue( i );
        objQueue.print();
        objQueue.enqueue( s );
        objQueue.print();
        // Use the dequeue method
        Object removedObj = null;
        try
        {
            while (!objQueue.isEmpty())
            {
                removedObj = objQueue.dequeue();
                System.out.println( removedObj.toString() +
                " dequeued" );
                objQueue.print();
            }
        }
        catch ( EmptyListException e )
        {
            System.err.println( "\n" + e.toString() );
        }
    }
}