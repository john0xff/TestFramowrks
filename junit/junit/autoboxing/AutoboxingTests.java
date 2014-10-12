package junit.autoboxing;

import junit.framework.Assert;

import org.junit.Test;

public class AutoboxingTests
{
	@Test
	public void testString()
	{
		String str = "new";
		
		// expected and actual
		Assert.assertEquals("new", str);
	}
	
	@Test
	public void testInt()
	{
		Integer integer = new Integer(10);
		
		Assert.assertEquals(Integer.valueOf(10), integer);
	}
	
	@Test
	public void testDouble()
	{
		Double db = new Double(20.02);
		
		Assert.assertEquals(Double.valueOf(20.02), db);
	}
	
	@Test
	public void testChar()
	{
		Character character = new Character('B');
		
		Assert.assertEquals(Character.valueOf('B'), character);
	}
	
	@Test
	public void testBoolean()
	{
		Boolean bool = new Boolean(true);
		
		Assert.assertEquals(Boolean.valueOf(true), bool);
	}
	
}
