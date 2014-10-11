package junit.setup;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBasic
{
	@Test
	public void transactBooleanTest()
	{
		Account account = new Account();
		account.transact(10).transact(-5);

		assertTrue("Test Failed Message", account.balanceAmount == 5);
	}

	@Test
	public void transactObjectTest()
	{
		Account accountOne = new Account();
		accountOne.transact(1000).transact(-300);
		Account accountTwo = new Account();
		accountTwo.transact(500);

		assertEquals("Test Failed Message", accountOne, accountTwo);
	}
}