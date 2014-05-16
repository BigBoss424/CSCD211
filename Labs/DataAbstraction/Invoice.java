   import java.util.*;

   public class Invoice extends Transaction
   {
   //  Add a true/false variable - 'isPaid'...
       protected boolean isPaid;
	     
   
   //  Add an Explicit Value Constructor.
	//   Parameters: int tranID, int customer, boolean paid
  	//   Note 'tranID' is private to the Item class
       public Invoice(int tranID, int customer, boolean paid)
       {
         super.tranID = tranID;
         super.participateID = customer;
         this.isPaid = paid;
       
       }
 
 
 
 
   
   //  Add an 'addItem' method here.
	//   The method creates a new InvoiceItem object and adds it to the ArrayList
	//    inherited from the Transaction class.
	//   Parameters: int itemID, String desc, double price, int qty, int ounces

      protected ArrayList<List> addItem(InvoiceItem o)
      {
         super.items.add(o);
         return items;
      }





   //  Override toString here.
   //   Return value must include 'tranID' from Transaction, 'isPaid' 
	//   and listing of InvoiceItems...
   //   See example output in output.txt.

      @Override
      public String toString()
      {
         return "Customer: " + tranID + "Paid: " + isPaid;
      }





   }
