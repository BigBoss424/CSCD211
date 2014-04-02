public class Node
{
   private Object item;
   private Node next;
   
   public Node(Object newItem)
   {
      this.item = newItem;
      this.next = null;
   }
   
   public Node(Object newItem, Node nextNode)
   {
      this(newItem);
      this.next = nextNode;
   }
   
   public Object getItem()
   {
      return this.item;
   }
   
   public void setItem(Object newItem)
   {
      this.item = newItem;
   }
   
   public Node getNext()
   {
      return this.next;
   }
   
   public void setNext(Node nextNode)
   {
      this.next = nextNode;
   }
   
   public String toString()
   {
      return this.getItem().toString();
   }

}