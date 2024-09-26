package Lesson19;

// QueueInheritance.java
// Class QueueInheritance definition
// Derived from List
public class QueueInheritance extends List
{
    public QueueInheritance()
    {
        super( "queue" );
    }
    public synchronized void enqueue( Object o )
    {
        insertAtBack( o );
    }

    public synchronized Object dequeue() throws EmptyListException
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