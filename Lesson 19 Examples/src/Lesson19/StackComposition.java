package Lesson19;

// StackComposition.java
// Class StackComposition definition with composed List object
public class StackComposition
{
    private List s;
    public StackComposition()
    {
        s = new List( "stack" );
    }
    public synchronized void push( Object o )
    {
        s.insertAtFront( o );
    }
    public synchronized Object pop() throws EmptyListException
    {
        return s.removeFromFront();
    }
    public synchronized boolean isEmpty()
    {
        return s.isEmpty();
    }
    public synchronized void print()
    {
        s.print();
    }
}