package test1;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest
{
	@Test
	public void numbers()
	{
		int factorialNumber = Factorial.factorial(5);
		
		Assert.assertEquals(120, factorialNumber);
		Assert.assertEquals(10, factorialNumber);
	}
}
