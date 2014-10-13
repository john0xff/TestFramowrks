package junit.autoboxing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutoboxingTests
{
	@Test
	public void testString()
	{
		String str = "new";

		// expected and actual
		assertEquals("new", str);
	}

	@Test
	public void testInt()
	{
		Integer integer = new Integer(10);

		assertEquals(Integer.valueOf(10), integer);
	}

	@Test
	public void testDouble()
	{
		Double db = new Double(20.02);

		assertEquals(Double.valueOf(20.02), db);
	}

	@Test
	public void testChar()
	{
		Character character = new Character('B');

		assertEquals(Character.valueOf('B'), character);
	}

	@Test
	public void testBoolean()
	{
		Boolean bool = new Boolean(true);

		assertEquals(Boolean.valueOf(true), bool);
	}

}
