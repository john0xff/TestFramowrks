package junit.tutpoint.exception.test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListTest
{
	@Test(expected = NullPointerException.class)
	public void exceptionExpected()
	{
		LinkedList<Integer> list = null;
		list.get(2);
	}
}