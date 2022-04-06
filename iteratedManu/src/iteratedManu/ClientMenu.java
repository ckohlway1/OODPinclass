package iteratedManu;
import java.util.*;
public class ClientMenu {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Menu fullMenu = new Menu();
		int userChoice;
		fullMenu.add(new MenuItem("8oz steak","12.99",Menu.NOT_HEART_HEALTHY,2));
		fullMenu.add(new MenuItem("Mac & Cheese","6.99",Menu.NOT_HEART_HEALTHY,1));
		fullMenu.add(new MenuItem("Fried Oreos","5.99",Menu.NOT_HEART_HEALTHY,3));
		fullMenu.add(new MenuItem("Mahi Mahi","15.99",Menu.HEART_HEALTHY,2));
		fullMenu.add(new MenuItem("Chiken Salad","8.99",Menu.HEART_HEALTHY,1));
		do {
			System.out.println("1-Display all Menu Items");
			System.out.println("2-Display all appetizers");
			System.out.println("3-Display all main dishes");
			System.out.println("4-Display all desserts");
			System.out.println("5-Display all heart healthy items");
			System.out.println("6-Display all dishes under a specific price");
			System.out.println("7-Add menu item");
			System.out.println("8-Remove menu item");
			System.out.println("0-Quit");
			
			userChoice = input.nextInt();
			switch(userChoice) {
				case 1:
					System.out.println();
					displayAllMenuItems(fullMenu);
					break;
				case 2:
					System.out.println();
					displayApps(fullMenu);
					break;
				case 3:
					System.out.println();
					displayMains(fullMenu);
					break;
				case 4:
					System.out.println();
					displayDesserts(fullMenu);
					break;
				case 5:
					System.out.println();
					displayHeartHealthy(fullMenu);
					break;
				case 6:
					System.out.println();
					System.out.print("Enter max price: ");
					String price = input.next();
					displayUnderPrice(fullMenu,price);
					break;
				case 7:
					System.out.println();
					addMenuItem(fullMenu);
					break;
				case 8:
					System.out.println();
					removeItem(fullMenu);
					break;
			}
		}while(userChoice != 0);
		
	}
	public static void displayAllMenuItems(Menu fullMenu) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getAllItemsIterator();
		
		while(iterator.hasNext()) {
			item = iterator.next();
			System.out.println(item.getItemName() + " $" + item.getPrice());
		}
		System.out.println("=========================");
		
	}
	public static void displayApps(Menu fullMenu) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getItemsIterator(Menu.APPETIZERS);
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getCategory() == Menu.APPETIZERS) {
				System.out.println(item.getItemName() + " $" + item.getPrice());
			}
		}
	}
	public static void displayMains(Menu fullMenu) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getAllItemsIterator();
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getCategory() == Menu.MAIN_DISH) {
				System.out.println(item.getItemName() + " $" + item.getPrice());
			}
		}
	}
	public static void displayHeartHealthy(Menu fullMenu) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getHeartHealthyIterator();
		while(iterator.hasNext()) {
			item = iterator.next();
			System.out.println(item.getItemName() + " $" + item.getPrice());

		}
	}
	public static void displayDesserts(Menu fullMenu) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getAllItemsIterator();
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getCategory() == Menu.DESSERT) {
				System.out.println(item.getItemName() + " $" + item.getPrice());
			}
		}
	}
	public static void displayUnderPrice(Menu fullMenu,String maxPrice) {
		MenuItem item;
		MenuIterator iterator = fullMenu.getAllItemsIterator();
		double itemPrice,D_maxPrice;
		D_maxPrice = Double.parseDouble(maxPrice);
		while(iterator.hasNext()) {
			item = iterator.next();
			if(Double.parseDouble(item.getPrice()) < D_maxPrice ) {
				System.out.println(item.getItemName() + " $" + item.getPrice());
			}
		}
	}
	public static void addMenuItem(Menu fullMenu) {
		System.out.print("Name of dish");
		String name = input.next();
		System.out.println();
		System.out.println("Cost: ");
		String price = input.next();
		System.out.println();
		System.out.println("1- Heart Healthy");
		System.out.println("2- Not Heart Healthy");
		System.out.print("1 or 2: ");
		int heart = input.nextInt();
		System.out.println();
		System.out.println("1-Appetizer");
		System.out.println("2-Main");
		System.out.println("3-Dessert");
		System.out.print("Choice: ");
		int type = input.nextInt();
		fullMenu.add(new MenuItem(name,price,(heart == 1)? Menu.HEART_HEALTHY : Menu.NOT_HEART_HEALTHY,type));
		System.out.println();
		
	}
	public static void removeItem(Menu fullMenu) {
		MenuItem item;
		char toRemove;
		MenuIterator iterator = fullMenu.getAllItemsIterator();
		System.out.println("input D when the desired dish shows");
		while(iterator.hasNext()) {
			item = iterator.next();
			System.out.println(item.getItemName() + " $" + item.getPrice());
			toRemove = input.next().charAt(0);
			if(toRemove == 'D') {
				fullMenu.remove(item);
				return;
			}
		}
	}
}
