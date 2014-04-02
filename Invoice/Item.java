public class Item{

	private Integer stockKeepingUnit;
	private String ItemDescription;
	private double unitPrice;
	private Integer quantityOnHand;
	private double unitWeight;
	
	public Item(Integer SKU, String itemDescript, double uP, Integer QOH, double weight)
	{
		this.stockKeepingUnit = SKU;
		this.ItemDescription = itemDescript;
		this.unitPrice = uP;
		this.quantityOnHand = QOH;
		this.unitWeight = weight;
	}

	public Integer getStockKeepingUnit() {
		return stockKeepingUnit;
	}

	public void setStockKeepingUnit(Integer stockKeepingUnit) {
		this.stockKeepingUnit = stockKeepingUnit;
	}

	public String getItemDescription() {
		return ItemDescription;
	}

	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}

	@Override
	public String toString() {
		return "SKU" + stockKeepingUnit + "Description: " + ItemDescription + "QOH" + quantityOnHand + "Price";
	}
	

	
	

}
