package in.shubham.beans;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println("CreditCard Payment :: Constructor");
	}

	public boolean processPayment(double billAmt) {
		//logic
		System.out.println("CreditCard Payment Successful...");
		return true;

	}

}
