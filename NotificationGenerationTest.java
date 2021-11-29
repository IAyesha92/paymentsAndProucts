package engine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotificationGenerationTest {
	Membership aMembership= new Membership();
	Payment aBook= new Payment(aMembership);
	Payment aPayment= new Payment();
	

	
	
	@Test
	void test() {
		
		aBook.applyPaymentAction(aPayment);
		
		//If the payment is for a physical product, generate a packing slip for shippin
		if(aBook instanceof PhysicalProduct && !(null==aBook.applyPaymentAction(aPayment)))
			assert (true);
<<<<<<< Updated upstream
	// 
		//if(aBook instanceof PhysicalProduct && !PaymentSlip.getForObject().getPackagingSlip.royalrtDepartment==null)
	
	//If the payment is for a membership, activate that membership
//		if(aPayment instanceof Membership && ((Membership) aPayment).isMemberShip())
//			assert(true);
	//If the payment is an upgrade to a membership, apply theupgrade.
//			if(Payment.isForUpgrade() && !Membership.isUpgraded()==true)
//				assert(true);
    //If the payment is for a membership or upgrade, e-mail the owner and inform them of the activation/upgrade
//		if(payment.isForUpgrade() || payment.isForUpgrade() )
//			?????????? 
					
	// If the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip (the result of a court 
	//	decision in 1997).
//		if(Payment.isVideo() && Payment.getVideName.equals("Learning to Ski") && PaymentSlip.getFreeString.equals("FirstAid"))
//			return true;
			
	//If the payment is for a physical product or a book, generate a commission payment to the agent. 
		
//		if((Payment.isPhysical() || Payment.isBook ) && !Payment.getCommission == null )
//			assert(true);
=======
>>>>>>> Stashed changes
	}
	
	@Test
	public void scenario2() {
		//If the payment is for a book, create a duplicate packing slip for the royalty department
		if(aBook instanceof Book && aBook.applyPaymentAction(aPayment).equals("Slip for Royalty Department"))
			assert(true);
	}
	@Test
	public void scenario3() {
		if(null== aPayment.getMembership()  && aPayment.getMembership().membershipActivated())
			assert(true);
	}
	@Test
	public void scenario4() {
<<<<<<< Updated upstream
=======
		//if(aPayment instanceof Membership && ((Membership) aPayment).isMemberShip())
		
		if(!(null==aPayment.getMembership()))
			assert(true);
>>>>>>> Stashed changes
		
	}
	@Test
	public void scenario5() {
<<<<<<< Updated upstream
		
	}
	@Test
	public void scenario6() {
	
	}
	@Test
	public void scenario7() {
		
=======
		//f the payment is for a membership or upgrade, e-mail the owner and inform them of the activation/upgrade.
		if(!(null==aPayment.getMembership()) || !(null== aPayment.getUpgrade() && (aPayment.getMembership().getEmailNotification().equals("Emailed notification-Membership") || aPayment.getMembership().getEmailNotification().equals("Emailed notification-Upgrade")))
				assert(true);
	}
	
	@Test
	public void scenario6() {
		// If the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip (the result of a court 
		if(aPayment instanceof Video && aPayment.getVideoList().size>2)
			assert(true);

	}
	@Test
	public void scenario7() {
		// If the payment is for a physical product or a book, generate a commission payment to the agent.
		if((aPayment instanceof PhysicalProduct || aBook instanceof Book)  aBook.applyPaymentAction(aPayment).equals("Commission Payment to AGENT"))
			assert(true);
>>>>>>> Stashed changes
	}

}
