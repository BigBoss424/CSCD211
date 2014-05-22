public class SelectionSortLL
{
  
  public void sort(LinkedList linkList)
  {
     Node smallest;
     Node curr;
     Node start;
     
     for(start = head.next; start.next != null; start = start.next;)
     {
	smallest = start;
	for(curr = start; curr != null; curr = curr.next)
	{
	  if(curr < smallest)
	  {
	    smallest = curr;
	  }
	}
	
	int temp = start.value;
	start.value = smallest.value;
	smallest.value = temp.value;
     }
  
  }
}