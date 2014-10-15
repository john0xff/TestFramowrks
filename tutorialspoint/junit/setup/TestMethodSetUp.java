package junit.setup;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMethodSetUp
{
	public static Account account = null;

	@Before
	public void createMethodEnvironMent()
	{
		account = new Account();
		System.out.println("Set Up Method Environment");
	}

	@After
	public void clearMethodEnvironMent()
	{
		account = null;
		System.out.println("Cleared Method Environment");
	}

	@Test
	public void transactBooleanTest()
	{
		assertTrue("Test Failed Message", account.transact(5).balanceAmount == 5);
	}

	@Test
	public void transactObjectTest()
	{
		Account accountOne = new Account();
		accountOne.transact(1000).transact(-1000);

		assertEquals("Test Failed Message", account, accountOne);
	}
}