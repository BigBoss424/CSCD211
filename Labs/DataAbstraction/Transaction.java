import java.util.*;
/*  Modify this source code in the space indicated only!
 *
 *  Implement the Comparable interface in this class (see below)...
 */  

 
public abstract class Transaction implements Comparable<Transaction>           // <--  Your code goes here
{
	// Note the tranID variable is private - do not change
	private   int  tranID;
	protected int  participantID;
	protected Date tranDate;
	protected ArrayList<Item> items;
	
	public Transaction(int tranID, int participantID)
	{
		this.tranID = tranID;
		this.participantID = participantID;
		this.tranDate = Calendar.getInstance().getTime();
		items = new ArrayList<Item>();
	}

	protected final ArrayList<Item> getItems()
	{
		return this.items;
	}

	/*  Implement the Comparable interface here.
	 *  Sort first by participantID and if the participantID's are the
	 *  same, sort by tranID.
	 */
	 
	 //  Your code goes here...
	 
    @Override
	 public int compareTo(Transaction that)
    {
      if(this.participantID > that.participantID)
         return 1;
      else if(participantID < that.participantID)
         return -1;
      else if(this.participantID == that.participantID)
         {
            if(this.transID > that.transID)
               return 1;
            else if(transID < that.transID)
               return -1;
         }
      else
         return 0;
     }
	   
	
	
	
	
	@Override
	public String toString()
	{
		return tranID + ", Date: " + tranDate;
	}
	
}
