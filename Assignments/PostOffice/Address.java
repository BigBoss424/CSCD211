import java.util.*;


public class Address implements Comparable<Address>
{
	private String street;
	private String city;
	private String zipCode;
	private String state;
	
	public Address(String street, String other)
	{
		int x;
		this.street = street;

		x = other.indexOf(",");
		this.city = other.substring(0, x).trim();

		x += 2;
		this.state = other.substring(x, x + 2).trim();

		x = other.indexOf("  ");
		this.zipCode = other.substring(x).trim();
	}
	
	public String getStreet()
	{
		return this.street;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getZipCode()
	{
		return zipCode;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
   public int compareTo(Address that)
   {
      return (this.zipCode.compareTo(that.zipCode) == 0) ? this.street.compareTo(that.street) : this.zipCode.compareTo(that.zipCode);
   }
   
  @Override
	public String toString()
	{
		return this.street + "\n" + this.city + ", " + this.state + "  " + this.zipCode;
	}
	

}