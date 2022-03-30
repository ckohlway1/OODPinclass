
public class PaypalStrategy implements PaymentStrategy {
	String emailID,password;
	
	public PaypalStrategy(String emailID, String password) {
		this.emailID = emailID;
		this.password = password;
	}

	public void pay(int amount) {
		System.out.println("Paying " + amount + "with paypal");
	}
}
