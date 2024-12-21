/**
   Programming Challenge 21-1.
   Double ended queue.
   This class implements a deque class based
   on linked list.
*/

public class DoubleEndedQueue
{
    /**
       The Node class stores a list element
       and a reference to the next node.
    */
    private class Node
    {
        String value;   // Value of a list element
        Node next;      // Next node in the list
        Node prev;      // Previous element in the list
        /**
           Constructor.            
           @param val The element to be stored in the node.
           @param n The reference to the successor node.
           @param p The reference to the predecessor node.
        */
        Node(String val, Node n, Node p)
        {
            value = val;
            next = n;
            prev = p;
        } 
        /**
           Constructor. Use when the node has no 
           successor or predecessor.
           @param val The element to be stored in the node.
        */
        Node(String val)
        {
           // Just call the other (sister) constructor
           this(val, null, null);            
        }
    }
    
    private Node first;   // First element on the list (head)
    private Node last;    // Last element on the list 
    
    /** 
       Constructor.
    */
    
    public DoubleEndedQueue()
    {
        first = null;
        last = null;        
    }
   
    /**
       The isEmpty method checks to see if the list
       is empty.
       @return true if list is empty, false otherwise.
    */
    
    public boolean isEmpty()
    {        
        return first == null;
    }
    
    /**
       The empty method checks to see if the list
       is empty.
       @return true if list is empty, false otherwise.
    */
    
    public boolean empty()
    {
        return isEmpty();
    }
    
    /**
       The size method returns the length of the list.
       @return The number of elements in the list.
    */
    
    public int size()
    {

    }
    
    /**
       The addRear method adds an element to the end of the list.
       @param e The value to add to the end of the list.       
    */
    
    public void addRear(String e)
    {
     
    }
    
    /**
       The addFront(e) method adds a new element to 
       the front of the  list.
       @parame e The element to add.
    */
    
    public void addFront(String e)
    {
       
    }   
    
    /**
       Remove and return the item at the front
       of the double ended queue.
    */
    
    public String removeFront()
    {

    }
    
    /**
       Remove and return the item at the rear
       of the double ended queue.
    */
    
    public String removeRear()
    {
       
    }    
    
    /**
       The toString method computes the string
       representation of the list.
       @return The string representation of the
       linked list.
    */
    
    public String toString()
    {
      StringBuilder strBuilder = new StringBuilder();
      
      // Use p to walk down the linked list
      Node p = first;
      while (p != null)
      {
         strBuilder.append(p.value + "\n"); 
         p = p.next;
      }      
      return strBuilder.toString(); 
    }    
}
