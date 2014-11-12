package setup;

import junit.framework.Assert;

import org.junit.Test;

public class TestJunit
{
	@Test
	public void testAdd()
	{
		String str = "New Word";
		Assert.assertEquals("aNew Word", str);
	}
}
