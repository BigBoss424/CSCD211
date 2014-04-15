public class Lawyers extends Employee
{
   protected int stock;
   
   public Lawyers()
   {
      super(name, Salary);
      this.stock = 0;
   }
   
   public int getStock()
   {
      return stock;
   }
   
   public void setStock(int stock)
   {
      this.stock = stock;
   }
   
   public int getOptions()
   {
      
   }
   public static void reportSalary()
   {
      System.out.println("I am a lawyer. I get" + getSalary() + ", and I have" + "\n" +
                         getOptions() + " shares of stock.");
   }
}