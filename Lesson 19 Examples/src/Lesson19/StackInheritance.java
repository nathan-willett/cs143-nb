package Lesson19;

// Class StackInheritance definition derived from class List
public class StackInheritance extends List
{
    public StackInheritance()
    {
        super( "stack" );
    }
    public synchronized void push( Object o )
    {
        insertAtFront( o );
    }
    public synchronized Object peek()
    {
        return firstNode.data;
    }
    public synchronized Object pop() throws EmptyListException
    {
        return removeFromFront();
    }
    public synchronized boolean isEmpty()
    {
        return super.isEmpty();
    }
    public synchronized void print()
    {
        super.print();
    }
}