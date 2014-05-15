
   public class InvoiceItem extends Item
   {
    
   //  Add variable 'ouncesPerUnit' as an int...
       protected int ouncesPerUnit;


   
   //  Add constructor.  
   //   Parameters are: int itemID, String description, double price, int quantityOrdered, int ouncesPerUnit
      public InvoiceItem(int itemID, String description, double price, int quantityOrdered, int ouncesPerUnit)
      {
         super.itemID = itemID;
         super.description = description;
         super.price = price;
         super.quantityOrdered = quantityOrdered;
         this.ouncesPerUnit = ouncesPerUnit;
      }
    
   



   
   //  Add 'changeInventory' method...
	//   The method creates a String that reports the processing that would take place.
	//   See example output in output.txt

   @Override 
   protected String changeInventory()
   {
      return "Inventory has been relieved for" + this.description + " by " + this.quantityOrdered;
   }


   
   
   //  Override 'toString' method here.
	//   Return 'toString' from Item class plus the ounces per unit...
   @Override
   public String toString()
   {
      return super.toString() + "Ounces: " + ouncesPerUnit + "\n";
   }



   
   
   }
