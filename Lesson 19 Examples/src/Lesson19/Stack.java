package Lesson19;

//Copyright (c) 1998, Arthur Gittleman
//This example is provided WITHOUT ANY WARRANTY either expressed or implied.

/* Implements the stack data type using
 * an array, and fields top and size.
 */ 

public class Stack {
  private int [] data;      //  holds the stack data
  private int size;         //  holds the size allocated
  private int top = -1;     //  holds the index of the top 
                            //  element, or -1 if none
  public Stack() { 
    size = 10;
    data = new int[size];
  }
  public Stack(int size) 
  {
    this.size = size;
    data = new int[size];
  }       
  public boolean isEmpty() 
  {
    return top == -1;
  }
  public boolean isFull() throws FullStackException
  {
    return top == size - 1;
  }
  public void push(int i)  throws FullStackException
  {
    if (isFull()) 
      throw new RuntimeException("Stack full -- cannot push");
    else
      data[++top] = i;
  }
  public int peek() throws EmptyStackException
  {
      return data[top];
  }
  public int pop() throws EmptyStackException
  {
    if (isEmpty())
       throw new RuntimeException("Stack empty -- cannot pop");
    else
       return data[top--];
  }
  public int top(){
    if (isEmpty()) 
      throw new RuntimeException("Stack empty -- top undefined");
    else
      return data[top];
  }
  public static void main(String [] args) {
    try {
      Stack stack1 = new Stack(); 
      Stack stack2 = new Stack(3);
      stack2.push(4);
      stack2.push(5);
      System.out.println("The top is now " + stack2.top());
      stack2.push(6);
      System.out.println("Popping stack 2 returns " + stack2.pop());
      System.out.println("Stack 1 has size " + stack1.size);
      System.out.println("Stack 1 empty? " + stack1.isEmpty());
      stack1.pop();
      System.out.println("Throws exception before we get here");
    }catch(Exception e) {
        e.printStackTrace();
    }
  }
}  
