package junit.setup;

import org.junit.Test;

public class TestException
{
	@Test(expected = NullPointerException.class)
	public void transactNullTest()
	{
		Account accountOne = new Account();
		accountOne.transact(100);

		Account accountTwo = null;
		accountOne.merge(accountTwo);
	}
}