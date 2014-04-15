public class Programmers extends Employee
{
   protected boolean busPass;
   
   public Programmers()
   {
      super(name, Salary);
      this.busPass = true;
   }
   
   public boolean getBusPass(boolean busPass)
   {
      
   }
   
   public static void reportSalary()
   {
      System.out.println("I am a programmer. I make" + getSalary() + "and I" + getBusPass() + 
                         "/n" + "get a bus pass.");
   }
   

}