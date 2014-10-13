package alogrithms.numbers.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonTest
{
	@Test
	public void fibonacciNumbers()
	{
		int[] fibNumbers =
		{ 1, 1, 2, 3, 5, 8, 13, 21 };

		for (int i = 1; i < fibNumbers.length; i++)
		{
			int testedNumber = FibonacciNumbers.getFibonnaciNumber(i);
			assertEquals(fibNumbers[i], testedNumber);
		}
	}
}
