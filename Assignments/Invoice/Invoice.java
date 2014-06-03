import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;


public class Invoice {
	
	private Integer orderNumber;
	private Integer customerNumber;
	//private Date orderDate;
	ArrayList<LineItem> list;
	
	public Invoice(Integer cN, Integer oN, ArrayList<LineItem> list)
	{
		this.orderNumber = oN;
		this.customerNumber = cN;
		this.list = new ArrayList();
	}
	
	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public ArrayList<LineItem> AddItem(Item item, Integer quantityOrdered)
	{
		LineItem newLineItem = new LineItem(item, quantityOrdered);
		list.add(newLineItem);
		
		return list;
	}

	@Override
	public String toString() {
		
		String s = this.customerNumber + "\t\t" + this.orderNumber + Calendar.getInstance().getTime() + "\n\n"
				 + "Description\t		Quantity\t		Extension\n\n";
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		return s;
	}
	
	
	
	
}
