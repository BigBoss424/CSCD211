public class Address
{
	private String street;
	private String city;
	private String zipCode;
	private String state;
	
	public Address()
	{
		this.street = "";
		this.city = "";
		this.zipCode = "";
		this.state = "";
	}
	
	public Address(String street, String city, String zipCode, String state)
	{
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
	
	public String getStreet(String street)
	{
		return this.street;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getCity(String city)
	{
		return this.city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getZipCode(String zipCode)
	{
		return zipCode;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public String getState(String state)
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String toString()
	{
		return "Street: " + this.street + "\n" +
			   "City: " + this.city + "\n" + 
			   "Zip Code: " + this.zipCode + "\n" +
			   "State: " + this.state;
	}
	

}