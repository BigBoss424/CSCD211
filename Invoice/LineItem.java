public class LineItem implements Comparable<LineItem> {

	private Item newItem;
	private Integer quantityOrdered;
	
	public LineItem(Item item, Integer qO)
	{
		this.newItem = item;
		this.quantityOrdered = qO;
	}

	public Item getNewItem() {
		return newItem;
	}

	public void setNewItem(Item newItem) {
		this.newItem = newItem;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	
	/*
	 * returns quantity ordered * unit price
	 */
	public Integer getExtensionPrice(Item item)
	{
		double unitPrice = item.getUnitPrice();
		return (int) (quantityOrdered * unitPrice);
	}
	
	/*
	 * returns quantity ordered * weight
	 */
	public Integer getExtensionWeight(Item item)
	{
		double weight = item.getUnitWeight();
		return (int) (quantityOrdered * weight);
	}

	@Override
	public String toString() {
		return "SKU: " + "/t" + "Description:" + "/t" + "Quantity" +"/t" + "Extension" + "/n" +
	           newItem.getStockKeepingUnit() + "/n" + quantityOrdered;
	}

	@Override
	public int compareTo(LineItem that) {
		
		return LineItem.this.newItem.getStockKeepingUnit().compareTo(that.newItem.getStockKeepingUnit());
	}
	
	
}
