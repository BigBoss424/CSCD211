import java.util.Random;

public class LinkedList 
{
   private Node head;
   private int size = 0;
   private static Random rand = new Random();
   
   
   public void generateList(int size)
   {
      if(size < 0)
        throw new IllegalArgumentException("List cannot contain negative values");
      clear();
      
      for(int i = 0; i < size; i++)
      {
         add(new Integer(rand.nextInt(100)));
      }  
        
   }
   
   public void add(Integer val)
   {
      Node n = head;
      
      if(head == null)
      {
         head = new Node(val);
      }
      else if(val.compareTo(head.data) < 0)
      {
         head = new Node(val, head);
      }
      else
      {
         while(n != null && n.next != null)
         {
            if(val.compareTo(n.next.data) < 0)
               break;
               
             n = n.next;
         }
         
         n.next = new Node(val, n.next);
      }
      this.size++;
   }
   
   public void print()
   {
      Node n = head;
      while(n != null)
      {
         System.out.println(n);
         n = n.next;
      }
   }
   public void printReversed()
   {
      printReversed(head);
   }
   
   private void printReversed(Node n)
   {
      if(n == null)
         return;
         
      printReversed(n.next);
      System.out.println(n);
   }
   
   public void printNth(int offset)
   {
      if(offset < 1)
         throw new IllegalArgumentException("Lowest possible number is 1.");
      Node n = head;
      int c = 0;
      
      while(n != null)
      {
         if(c%offset == 0)
            System.out.println(n);
            
           c++;
           n = n.next;
      }
   }
   
   public LinkedList getEvens()
   {
      LinkedList result = new LinkedList();
      Node n = head;
      
      while(n != null)
      {
         if(n.data %2 == 0)
            result.add(n.data);
            
            n = n.next;
      }
      
      return result;
   }
   
   public int deleteValue(Integer val)
   {
      Node n = head;
      int c = 0;
      
      while(n != null && n.next != null)
      {
         if(n.next.data.equals(val))
         {
            n.next = n.next.next;
            c++;
            this.size--;
         }
         else
            n = n.next;
      }
      return c;
   }
   
   public void clear()
   {
      head = null;
      size = 0;
   }
   
   public int getSize()
   {
      return size;
   }
   
   private class Node
   {
      public Integer data;
      public Node next;
   
      public Node(Integer data)
      {
         this(data,null);
      }
      
      public Node(Integer data, Node next)
      {
         this.data = data;
         this.next = next;
      }
      
      @Override
      public String toString()
      {
         return data.toString();
      }
   }
   
}