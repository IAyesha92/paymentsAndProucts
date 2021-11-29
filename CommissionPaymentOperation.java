package engine;

public interface CommissionPaymentOperation extends PaymentOperations {
	default String applyPaymentAction() {
		return "Commission Payment to AGENT";
	}
	
}
