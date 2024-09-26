package Lesson19;

public class QueueComposition 
{
    private List s;     //QueueuComposition has a list
    public QueueComposition()
    {
        s = new List( "queue" );
    }
    public synchronized void enqueue( Object o )        //poll()
    {
        s.insertAtBack( o );
    }
    public synchronized Object dequeue() throws EmptyListException
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