//  Do not madify this file!
public class Tester
{
   public static void main ( String[] args )
   {
      Integer [] array  = { 60, 90, 20, 40, 0, 30, 80, 100, 70, 0, 50};				
		
		Integer [] values = {10, 60, 110, 50, 0};		
		
		Integer [] values2 = {200, 210, 220};		  
				
      LinkedListB list = new LinkedListB();
			
  		   	
		list.addAll(array);
					
      System.out.println ("After adding " + array.length + " items " +
                          "the list size is " + list.size());
	  	System.out.println("List is:\n" + list);
		System.out.println();
		
		
		if(list.removeAll(values))
		{
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end if
		
		else
		{
			System.out.println("---List NOT modified--");
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end else
		
		list.clear();
		
		if(list.removeAll(values))
		{
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end if
		
		else
		{
			System.out.println("---List NOT modified--");
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end else
		
		list.addAll(array);
					
      System.out.println ("After adding " + array.length + " items " +
                          "the list size is " + list.size());
	  	System.out.println("List is:\n" + list);
		System.out.println();
		
		if(list.removeAll(values2))
		{
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end if
		
		else
		{
			System.out.println("---List NOT modified--");
			System.out.println ("After removeAll the list size is " + list.size());
	  		System.out.println("List is:\n" + list);
			System.out.println();
		}// end else
		
		try
		{
			values2 = null;
			
			if(list.removeAll(values2))
			{
				System.out.println ("After removeAll the list size is " + list.size());
		  		System.out.println("List is:\n" + list);
				System.out.println();
			}// end if
		
			else
			{
				System.out.println("---List NOT modified--");
				System.out.println ("After removeAll the list size is " + list.size());
		  		System.out.println("List is:\n" + list);
				System.out.println();
			}// end else
		
		}// end try
		
		catch(Exception e)
		{
			System.out.println("---List NOT modified-- (null)");
			System.out.println(e.getMessage());
			System.out.println ("After removeAll the list size is " + list.size());
		  	System.out.println("List is:\n" + list);
			System.out.println();
		}// end catch
      
		System.out.println("Finished");
		
   }// end main
	
}// end class
