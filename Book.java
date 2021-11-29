package engine;

public  class Book  extends Payment implements PhysicalProduct{
	

	public String generateDuplictePackagingSlip() {
		return "Slip for Royalty Department";
	}

	public String applyPaymentAction(PaymentOperations operation) {
		return generateDuplictePackagingSlip();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
}
