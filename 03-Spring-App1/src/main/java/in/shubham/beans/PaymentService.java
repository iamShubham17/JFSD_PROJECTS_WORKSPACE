package in.shubham.beans;

public class PaymentService {

	private IPayment payment;

	public PaymentService() {
System.out.println("Payment Service :: Constructor ");
	}

	public PaymentService(IPayment payment) {
		System.out.println("PaymentService :: Param-Constructor");
		this.payment = payment;

	}
	
	// setters method
	public void setPayment(IPayment payment) {
		System.out.println("Setters Method Called...");
		this.payment = payment;
	}

	public void doPayment(double billAmt) {

		boolean status = payment.processPayment(billAmt);

		if (status) {
			System.out.println("Recipt Printing");
		} else {
			System.out.println("Card Declined");
		}
	}

}
