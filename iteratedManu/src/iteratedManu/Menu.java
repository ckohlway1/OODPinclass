package iteratedManu;

import java.util.*;

public class Menu {
	
	ArrayList<MenuItem> menuItems;
	public static final int APPETIZERS = 1;
	public static final int MAIN_DISH = 2;
	public static final int DESSERT = 3;
	public static final boolean HEART_HEALTHY = true;
	public static final boolean NOT_HEART_HEALTHY = false;
	
	public Menu() {
		menuItems = new ArrayList<MenuItem>();
	}
	
	public void add(MenuItem item) {
		menuItems.add(item);
	}
	public void remove(MenuItem item) {
		menuItems.remove(item);
	}
	
	private class AllItemIterator implements MenuIterator {
		int position = 0;
		
		@Override
		public boolean hasNext() {
			if(position >= menuItems.size() || menuItems.get(position) == null) {
			return false;	
			}else {
				return true;
			}
		}

		@Override
		public MenuItem next() {
			MenuItem temp = menuItems.get(position);
			position++;
			return temp;
		}
	}
	public MenuIterator getAllItemsIterator() {
		return new AllItemIterator();
	}
	private class itemsIterator implements MenuIterator{
		int position = 0;
		
		public itemsIterator(int foodType) {}
		@Override
		public boolean hasNext() {
			if(position > menuItems.size() - 1 || menuItems.get(position) == null) {
				return false;
			}else {
				return true;
			}
		}

		@Override
		public MenuItem next() {
			MenuItem temp = menuItems.get(position);
			position++;
			return temp;		}
	}
	public MenuIterator getItemsIterator(int foodType) {
		return new itemsIterator(foodType);
	}
	
	private class HearthHealthyIterator implements MenuIterator{
		int position = 0;
		
		@Override
		public boolean hasNext() {
			if(position > menuItems.size() - 1 || menuItems.get(position) == null) {
				return false;
			}else {
				return true;
			}
		}

		@Override
		public MenuItem next() {
			MenuItem temp = menuItems.get(position);
			while(!temp.isHeartHealty()) {
				position++;
				temp = menuItems.get(position);
			}
			position++;
			return temp;
		}		
	}
	public MenuIterator getHeartHealthyIterator() {
		return new HearthHealthyIterator();
	}
	
	private class PriceIterator implements MenuIterator{
		int position = 0;
		public PriceIterator(String FoodPrice) {}
		@Override
		public boolean hasNext() {
			if(position > menuItems.size() - 1 || menuItems.get(position) == null) {
				return false;
			}else {
				return true;
			}
		}

		@Override
		public MenuItem next() {
			MenuItem temp = menuItems.get(position);
			position++;
			return temp;
		}
		
	}
	public MenuIterator getPriceIterator(String Price) {
		return new PriceIterator(Price);
	}
	
}
