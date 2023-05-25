package exercise1;

public class AccountType {

	public static final int REGULAR_ACCOUNT = 0;
	public static final int PREMIUM_ACCOUNT = 1;
	
	private int accountType;
	
	public boolean isPremium() {
		if (this.accountType == PREMIUM_ACCOUNT)
			return true;
		return false;
	}
	
	// Consider there is additional code here...

}
