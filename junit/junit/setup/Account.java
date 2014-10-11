package junit.setup;
public class Account
{
	boolean loggedIn = false;
	int balanceAmount = 0;
	
	public Account transact(int creditAmount)
	{
		balanceAmount = balanceAmount + creditAmount; 
		return this;
	}
	
	public Account merge(Account account)
	{
		balanceAmount = balanceAmount + account.balanceAmount; 
		return this;
	}
}