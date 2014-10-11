package junit.setup;

import org.junit.Test;

public class TestTimeout
{
	@Test(timeout = 100)
	public void testTransactTimeout()
	{
		try
		{
			Thread.sleep(1000); // Placeholder code for a network activity with latency
		}
		catch (Exception e)
		{
			// e.printStackTrace();
		}
	}
}