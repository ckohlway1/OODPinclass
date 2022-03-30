
public class CredtCardStrategy implements PaymentStrategy {
	String cardHolderName,cardNo,expDate;
	
	
	
	public CredtCardStrategy(String cardHolderName, String cardNo, String expDate) {
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.expDate = expDate;
	}



	public void pay(int amount) {
		System.out.println("Paying " + amount + "with credit card");
	}
	
}
