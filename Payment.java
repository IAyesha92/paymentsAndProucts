package engine;

public class Payment implements PaymentOperations {
	Membership aMembership;
	Upgrade anUpgrade;
	
	public  Payment(Membership aMembership) {
		this.aMembership= aMembership;
	}
	public Payment() {
	}
	
	public void Payment(Upgrade upgrade) {
		this.anUpgrade= upgrade;
	}
	
	public String applyPaymentAction(PaymentOperations operation) {
		if(operation==null) {
			return "INVALID OPERATION";
		}
		return operation.applyPaymentAction();
	}
	
	public Membership getMembership() {
		return this.aMembership;
	}
}
