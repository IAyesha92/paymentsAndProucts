package engine;

public interface Upgrade extends PaymentOperations {
	
	default String membershipAction() {
		return "Membership upgraded";
	}

}
