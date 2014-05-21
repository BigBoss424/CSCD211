public class Letter extends PostOffice implements Comparable<Letter>
{
   private static final double POSTAGE_RATE = 0.46;
   private String fromName;
   private Address fromAddr;
   private String toName;
   private Address toAddr;
   private double weight;
   
   public Letter(String fromName, String fromStreet, String fromCity, String fromState, String fromZip, String toName,
                 String toStreet, String toCity, String toState, String toZip, double weight)
   {
      this.fromName = fromName;
      this.fromAddr = new Address(fromStreet, fromCity, fromState, fromZip);
      this.toName = toName;
      this.toAddr = new Address(toStreet, toCity, toState, toZip);
      this.weight = weight;   
   
   }
   
   public String toString()
   {
      String result;
      result = String.format("from: %\t\t\t%5.2f\n%s", fromName, getPostage(weight),fromAddr);
      result = result + String.format("\t\t To: %s\n\t\t%s", toName, toAddr);
      return result;
   
   }
   
   public int compareTo(Letter that) 
   {
      int value;
      value = this.toAddr.getZip().compareTo(that.toAddr.getZip());
      return value;
   }

   
   public static double getPostage(double weight)
   {
      double workWeight;
      workWeight = weight + 0.999;
      workWeight = (int)workWeight;
      return workWeight * POSTAGE_RATE;
   }

}