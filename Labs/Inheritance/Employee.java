public abstract class Employee
{
   protected String name;
   protected int Salary;
   
   public Employee()
   {
      this.name = "";
      this.Salary = 0;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getSalary()
   {
      return this.Salary;
   }
   
   public void setSalary(int Salary)
   {
      this.Salary = Salary;
   }
   
   public String toString()
   {
      return "Name" + name + "/n"
             + "Salary" + Salary;
   }

}//end class