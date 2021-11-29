package engine;

public interface PaymentOperations {

	default String applyPaymentAction() {
		return "Slip generated.";
	}
	
	default String membershipAction() {
		return null;
	}
	
}
