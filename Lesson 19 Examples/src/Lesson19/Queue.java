package Lesson19;

/* Implements the queue data type using
 * an array, and fields front, back, and size.
 */ 

public class Queue 
{
  private int [] data;      //  stack data
  private int size;         //  size allocated
  private int front = -1;   //  index of the front, -1 if empty
  private int back = 0;     //  index of the first free spot.
  private int count = 0;    //  number of elements in queue

  public Queue() { 
    size = 10;
    data = new int[size];
  }
  public Queue(int size) {
    this.size = size;
    data = new int[size];
  }       
  public boolean isEmpty() {
    return  count == 0;
  }
  public boolean isFull() {
    return count == size;
  }
  public void add(int i){
    if (isFull())
      throw new RuntimeException("Queue full -- cannot add");
    else {
      count++;
      data[back++ % size] = i;
    }
  }
  public int remove(){
    if (isEmpty())
       throw new RuntimeException("Queue empty -- cannot remove");
    else {
       count--;
       return data[++front % size];
    }
  }
  public int head(){
    if (isEmpty()){
      throw new RuntimeException("Queue empty -- head undefined");
    }
    else
      return data[(front+1) % size];
  }
  public static void main(String [] args) {
    try {
      Queue q1 = new Queue();
      Queue q2 = new Queue(3);
      q2.add(4);
      q2.add(5);
      System.out.println("The front is now " + q2.head());
      q2.add(6);
      System.out.println("Removing from q2 returns " + q2.remove());
      System.out.println("Queue 1 has size " + q1.size);
      System.out.println("Queue 1 empty? " + q1.isEmpty());
      q1.remove();
      System.out.println("Throws exception before we get here");
    }catch(Exception e) {
        e.printStackTrace();
    }
  }
}  
