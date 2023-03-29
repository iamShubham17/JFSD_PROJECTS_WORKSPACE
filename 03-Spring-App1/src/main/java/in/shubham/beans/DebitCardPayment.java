package in.shubham.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCard Payment :: Constructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard Payment successfull...");
		return true;
	}

}
