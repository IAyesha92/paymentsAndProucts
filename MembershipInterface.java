package engine;

public interface MembershipInterface extends PaymentOperations {
	
	default String membershipAction() {
		return "Membership activated";
	}

}
