import java.util.*;


public class Address
{
	private String street;
	private String city;
	private String zipCode;
	private String state;
	
	public Address(String street, String city, String state, String zip)
	{
		this.street = street;
		this.city = city;
		this.state = state;
      this.zipCode = zip;
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
	
	public String toString()
	{
      String result;
      result = String.format("%s\n%s, %s %s", street, city, state, zipCode);
      return result;
	}
	

}