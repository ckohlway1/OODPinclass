package iteratedManu;

public class MenuItem {
	private String ItemName;
	private String Price;
	private boolean heartHealty;
	private int Category;
	
	public MenuItem(String itemName, String price, boolean heartHealty, int category) {
		this.ItemName = itemName;
		this.Price = price;
		this.heartHealty = heartHealty;
		this.Category = category;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public boolean isHeartHealty() {
		return heartHealty;
	}

	public void setHeartHealty(boolean heartHealty) {
		this.heartHealty = heartHealty;
	}

	public int getCategory() {
		return Category;
	}

	public void setCategory(int category) {
		Category = category;
	}
	
	
	
}
