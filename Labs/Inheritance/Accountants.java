public class Accountants extends Employee
{
   protected double parkingAllowance;
   
   public Accountants()
   {
      super(name, Salary);
      this.parkingAllowance = 0.0;
   }
   
   public double getParking()
   {
      return parkingAllowance;
   }
   public static void reportSalary()
   {
      System.out.println("I am an accountant. I make" + getSalary() + " plus a parking allowance of" + getParking());
   }
   

}//end class