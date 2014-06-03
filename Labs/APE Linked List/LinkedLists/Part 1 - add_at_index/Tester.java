 //  Do not change this class!  
   public class Tester
   {
      public static void main ( String[] args )
      {
         Integer [] values  = { 10, 30, 50, 70, 90 };
      								  
         LinkedListA list = new LinkedListA();
      
         for (int x = 0; x < values.length; x++ )
         {
            list.add(x, values[x]);
         }
      	
         System.out.println ("After adding " + list.size() + " items");
      
         System.out.println(list);
         System.out.println();
      	   
         list.add(1, new Integer(20));
         list.add(3, new Integer(40));			
         list.add(5, new Integer(60));			
         list.add(7, new Integer(80));			
      
         System.out.println ("After adding " + list.size() + " items");
      
         System.out.println(list);
      	
         System.out.println("\nTrying to add a node at an invalid location...");
      				
      	//  Adding at an invalid location...
         try
         {
            list.add(-1, new Integer(-1));
         }
         catch (Exception e)
         {
            System.out.println(e.toString());
         }
      
         System.out.println("\nFinished");
      
      }// end main
   
   }// end class
