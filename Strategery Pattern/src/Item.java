
public class Item {
	private String upcCode;
	private int price;
	
	public Item(String upc, int cost){
		this.upcCode = upc;
		this.price = cost;
	}
	public String getUpcCode() {
		return this.upcCode;
	}
	public int getPrice() {
		return this.price;
	}

}
