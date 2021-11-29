package engine;

public class Membership {

	public boolean isMembership;
	public boolean isMemberShipActivated;
	public boolean isUpgraded;
	
	public boolean isMemberShip() {
		return true;
	}
	
	public boolean membershipActivated() {
		isMemberShipActivated=true;
		return true;
	}
	
	public String upgradeMembership() {
		isUpgraded=true;
		return "Membership is Upgraded";
	}
}
