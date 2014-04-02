@SuppressWarnings({"unchecked"})
public class LinkedList implements ListInterfaces
{
   private class Node
   {
      public Comparable item;
      public Node next;
      
      public Node(Comparable newItem)
      {
         this.item = newItem;
         this.next = null;
      }
      
      public String toString()
      {
         return this.item.toString();
      }
    }//end Node class
    
    private Node head;
    private int size;
    
    public LinkedList()
    {
      head = null;
      size = 0;
    }
    
    @Override 
    public boolean isEmpty()
    {
      return size == 0;
    }
    
    @Override
    public int getSize()
    {
      return size;
    }
    
    @Override
    public void add(Comparable newItem)
    {
      Node newNode = new Node(newItem);
      Node curr;
      
      if(isEmpty())
      {
         this.head = newNode;
      }
      else
      {
         for(curr = head; curr.next != null; curr = curr.next);
         curr.next = newNode;
      }
      
      size++;
    }//end add method
    
    @Override
    public void add(int index, Comparable newItem)
    {
      if(index >= 0 && index <= size)
      {
          Node newNode = new Node(newItem);
          Node prev;
          
          if(index == 0)
          {
            newNode.next = head;
            this.head = newNode;
          }
          else
          {
            prev = find(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
          }
          size++;
      }
      else
      {
        throw new IndexOutOfBoundsException("Invalid index value: " + index);
      }
    }//end add(int, comparable)
    
    @Override
    public void addOrdered(Comparable newItem)
    {
      Node newNode = new Node(newItem);
      Node prev;
      
      prev = find(newItem);
      
      if(prev == null)
      {
         newNode.next = head;
         head = newNode;
      }
      else
      {
         newNode.next = prev.next;
         prev.next = newNode;
      }
      size++;
    
    }//end addOrdered
    
    private Node find(int index)
    {
      Node curr = head;
      
      for(int skip = 0; curr.next != null && skip < index; skip++)
      {
         curr = curr.next;
      }
      
      return curr;
      
    }
    
    private Node find(Comparable pItem)
    {
      Node curr = null;
      Node prev = null;
      
      for(curr = head;
          curr != null && curr.item.compareTo(pItem) < 0;
          prev = curr, curr = curr.next);
          
          return prev;
    }
    
    @Override
    public void remove(int index)
    {
      if(index == 0)
      {
         head = head.next;
      }
      else
      {
         Node prev = find(index - 1);
         Node curr = prev.next;
         prev.next = curr.next;
         curr = null;
      }
      size--;
    }//end remove
    
    @Override
    public void removeAll()
    {
      this.head = null;
      size = 0;
    }//end removeAll
    
    @Override
    public String toString()
    {
      String result = "";
      
      for(Node curr = this.head; curr != null; curr = curr.next)
      {
         result = result + curr.item.toString() + "\n";
      }
      return result;
    }//end toString

}//end LinkedList