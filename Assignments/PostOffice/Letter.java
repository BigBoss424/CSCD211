import java.text.DecimalFormat;

public class Letter extends PostOffice implements Comparable<Letter>
{
   private static final double POSTAGE_RATE = 0.46;
   private String fromName;
   private Address fromAddr;
   private String toName;
   private Address toAddr;
   private double weight;
   
   public Letter(String toName, String toAddr, String fromName, String fromAddr, double weight)
	{
		int x;		 
		this.toName = toName;
		this.fromName = fromName;

		x = toAddr.indexOf("\n");
		this.toAddr = new Address(toAddr.substring(0, x), toAddr.substring(x));

		x = fromAddr.indexOf("\n");
		this.fromAddr = new Address(fromAddr.substring(0, x), fromAddr.substring(x));

		this.weight = weight;
	}
   
   @Override
   public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		String result;
		String indent = "                    ";


		result = "----------------------------------------------------------------------------\n";

		// formatting preparation for "from" address
		String firstLine = "From: " + this.fromName;
		String price = "$" + df.format(getPostage(this.weight));
		firstLine += repeat(" ", 76 - firstLine.length() - price.length()) + price;

		// add "from" details
		result += firstLine + "\n";
		result += this.fromAddr.toString();

		// formatting preparation for "to" address
		String address = this.toAddr.toString();
		int x = address.indexOf("\n");

		// add "to" details
		result +=  "\n\n" + indent + this.toName + "\n";
		result += indent + address.substring(0, x).trim() + "\n";
		result += indent + address.substring(x + 1).trim() + "\n";

		result += "----------------------------------------------------------------------------";


		return result;
	}
   
   public static String repeat(String str, int times)
	{
		return new String(new char[times]).replace("\0", str);
	}
   
   public int compareTo(Letter that) 
   {
      return this.toAddr.compareTo(that.toAddr);
   }

   
   public static double getPostage(double weight)
   {
      double workWeight;
      workWeight = weight + 0.999;
      workWeight = (int)workWeight;
      return workWeight * POSTAGE_RATE;
   }

}