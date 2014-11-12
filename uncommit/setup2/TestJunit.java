package setup2;

import org.junit.Test;

import junit.framework.Assert;

public class TestJunit
{
	@Test
	public void testString()
	{
		String str = "new";
		Assert.assertEquals("newa", str);
	}
}
