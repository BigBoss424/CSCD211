public class ListReferenceBased implements ListInterface
{
   private Node head;
   private int numItems;
   
   public ListReferenceBased()
   {
      head = null;
      numItems = 0;
   }
   
   @Override
   public boolean isEmpty()
   {
      return numItems == 0;
   }
   
   @Override
   public int getSize()
   {
      return numItems;
   }
   
   @Override
   public void addNode(Object newItem)
   {
      Node newNode = new Node(newItem);
      Node curr;
      
      if(isEmpty())
      {
         this.head = newNode;
      }
      else
      {
         for(curr = head;
             curr.getNext() != null;
             curr = curr.getNext());
         curr.setNext(newNode);
      }
      numItems++;
   }
   
   @Override
   public void addNode(int index, Object newItem)
   {
      Node newNode = new Node(newItem);
      Node prev;
      
      if(index == 1)
      {
         newNode.setNext(head);
         this.head = newNode;
      }
      else
      {
         prev = find(index -1);
         newNode.setNext(prev.getNext());
         prev.setNext(newNode);
      }
      numItems++;
   }
   
   @Override
   public void removeNode(int index)
   {
      if(index == 1)
      {
         head = head.getNext();
      }
      else
      {
         Node prev = find(index -1);
         Node curr = prev.getNext();
         prev.setNext(curr.getNext());
      }
      numItems--;
      
   }
   
   @Override
   public void removeAll()
   {
      this.head = null;
      numItems = 0;
   }
   
   private Node find(int index)
   {
      Node curr = head;
      
      for(int skip = 1; skip < index; skip++)
      {
         curr = curr.getNext();
      }
      return curr;
   }
   
   @Override
   public String toString()
   {
      String result = "";
      
      for(Node curr = this.head; curr != null; curr = curr.getNext())
      {
         result = result + curr.getItem().toString() + "\n";
      }
      
      return result;
   }
}