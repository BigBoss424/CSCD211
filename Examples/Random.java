public class Random
{
   public static void main(String [] args)
   {
      Random randomGenerator = new Random();
      
      for (int i =0; i < 5; i++)
      {
         System.out.println(" " + randomGenerator.nextInt());
      }
      System.out.println("\n");
      
      //For integers in a range 0 to a...
      for(int i = 0; i < 10; i++)
      {
         System.out.println(" " + randomGenerator.nextInt(100));
      }
      
      System.out.println("\n");
      
      System.out.println("\nUsing Math.random: ");
      
      //For double between 0.0 and .99999...
      for(int i = 0; i < 10; i++)
      {
         double d = Math.random();
         System.out.print(" " + d);
      }
      
      System.out.println(""):
      
     /* System.out.println("\nRolling a die with math.random.");
      int [] counts = new int[6];
      for(int i = 0; i < 10000000; i++)
      {
         int die1 = (int)(Math.random()+
      }
     for(int j = 0; j < counts.length; j++)
      {
         System.out.println((j + 1)+ ": "
      }*/

      /*
       Rolling a dice using randomGenerator
      */
      for(int i = 0; i < 10; i++)
      {
         System.out.println(randomGenerator.nextint(6) + 1 + " ");
      }
    }
}//end class