package junit.setup;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClassSetUp
{
	public static Account account = null;

	@BeforeClass
	public static void createEnvironMent()
	{
		account = new Account();
		System.out.println("Set Up Environment");
	}

	@AfterClass
	public static void clearEnvironMent()
	{
		account = null;
		System.out.println("Cleared Environment");
	}

	@Test
	public void testIsLoggedIn()
	{
		assertTrue(account.transact(5).balanceAmount == 5);
	}
}
