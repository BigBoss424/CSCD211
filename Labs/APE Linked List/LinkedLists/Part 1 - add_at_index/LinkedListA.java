   public class LinkedListA extends LinkedList
   {
      // Complete the 'add by index' method below.
		// The inherited class 'LinkedList' uses a dummy head node.
   	// Note if you use a 'find' method you must write it.
		// Be sure to test for an invalid index and throw an 
		// IndexOutOfBoundsException if found...
   	// Don't forget to update size!
   	
      public void add(int index, Comparable dataToAdd)
      {
         if(index >= 0 && index <= size)
         {
            Node newNode = new Node(dataToAdd);
            if(index == 0)
            {
               newNode.next = head.next;
               head.next = newNode;
               
            }
            else
            {
               Node prev = find(index - 1);
               newNode.next = prev.next;
               prev.next = newNode;
            }
            size++;
         
         }
         else
         {
            throw new IndexOutOfBoundsException("Index out of Bounds" + index);
            
         }
      }// end add	
      
      //Add find method
      private Node find(int index)
      {
         Node curr = head.next;
         for(int skip = 0; skip < index; skip++)
         {
            curr = curr.next;
         }
         return curr;
      }
   

   }// end class
