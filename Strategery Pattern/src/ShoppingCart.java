import java.util.*;
public class ShoppingCart {
List<Item> items;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		int total = 0;
		for(int i = 0; i < items.size();i++) {
			total += items.get(i).getPrice();
		}
		return total;
	}
	
	public void pay(PaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

}
