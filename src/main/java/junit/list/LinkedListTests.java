package junit.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTests
{
	OurList<Integer> emptyList; // a global variable, visible to all methods
	OurList<Integer> threeElementsInOrder;
	OurList<Integer> threeElementsNotInOrder;

	@Before
	public void createLists() throws ListIndexOutOfBoundsException
	{
		emptyList = new OurLinkedList<Integer>();
		threeElementsInOrder = new OurLinkedList<Integer>();
		
		// elements added to indices 0, 1, 2, in this order
		threeElementsInOrder.add(0, 5);
		threeElementsInOrder.add(1, 7);
		threeElementsInOrder.add(2, 3);
		
		// elements added out of order
		threeElementsNotInOrder = new OurLinkedList<Integer>();
		threeElementsNotInOrder.add(0, 3);
		threeElementsNotInOrder.add(0, 5);
		threeElementsNotInOrder.add(1, 7);
	}

	@Test
	public void testEmptyList()
	{
		assertTrue(emptyList.isEmpty());
		assertEquals(0, emptyList.size());
	}

	@Test
	public void testElementsAddedInOrder() throws ListIndexOutOfBoundsException
	{
		assertFalse(threeElementsInOrder.isEmpty());
		assertEquals(3, threeElementsInOrder.size());
		assertEquals(new Integer(5), threeElementsInOrder.get(0));
		assertEquals(new Integer(7), threeElementsInOrder.get(1));
		assertEquals(new Integer(3), threeElementsInOrder.get(2));
	}

	@Test
	public void testRemoveLastElementsAddedInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.remove(2);
		assertEquals(2, threeElementsInOrder.size());
		assertEquals(new Integer(5), threeElementsInOrder.get(0));
		assertEquals(new Integer(7), threeElementsInOrder.get(1));
	}

	@Test
	public void testRemoveFirstElementsAddedInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.remove(0);
		assertEquals(2, threeElementsInOrder.size());
		assertEquals(new Integer(7), threeElementsInOrder.get(0));
		assertEquals(new Integer(3), threeElementsInOrder.get(1));
	}

	@Test
	public void testRemoveAllAddedInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.remove(2);
		threeElementsInOrder.remove(0);
		threeElementsInOrder.remove(0);
		assertEquals(0, threeElementsInOrder.size());
		assertTrue(threeElementsInOrder.isEmpty());
	}

	@Test
	public void testElementsAddedNotInOrder() throws ListIndexOutOfBoundsException
	{
		assertFalse(threeElementsNotInOrder.isEmpty());
		assertEquals(3, threeElementsNotInOrder.size());
		assertEquals(new Integer(5), threeElementsNotInOrder.get(0));
		assertEquals(new Integer(7), threeElementsNotInOrder.get(1));
		assertEquals(new Integer(3), threeElementsNotInOrder.get(2));
	}

	@Test
	public void testRemoveLastElementsAddedNotInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsNotInOrder.remove(2);
		assertEquals(2, threeElementsNotInOrder.size());
		assertEquals(new Integer(5), threeElementsNotInOrder.get(0));
		assertEquals(new Integer(7), threeElementsNotInOrder.get(1));
	}

	@Test
	public void testRemoveFirstElementsAddedNotInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsNotInOrder.remove(0);
		assertEquals(2, threeElementsNotInOrder.size());
		assertEquals(new Integer(7), threeElementsNotInOrder.get(0));
		assertEquals(new Integer(3), threeElementsNotInOrder.get(1));
	}

	@Test
	public void testRemoveAllAddedNotInOrder() throws ListIndexOutOfBoundsException
	{
		threeElementsNotInOrder.remove(2);
		threeElementsNotInOrder.remove(0);
		threeElementsNotInOrder.remove(0);
		assertEquals(0, threeElementsNotInOrder.size());
		assertTrue(threeElementsNotInOrder.isEmpty());
	}

	// Testing for exceptions (one per test)

	@Test(expected = ListIndexOutOfBoundsException.class)
	public void testExceptionAdd() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.add(5, 8);
	}

	// this test fails!
	@Test(expected = ListIndexOutOfBoundsException.class)
	public void testExceptionAddOnePastSize() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.add(threeElementsInOrder.size() + 1, 8);
	}

	@Test(expected = ListIndexOutOfBoundsException.class)
	public void testExceptionGet() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.get(threeElementsInOrder.size());
	}

	@Test(expected = ListIndexOutOfBoundsException.class)
	public void testExceptionGetNegative() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.get(-1);
	}

	@Test(expected = ListIndexOutOfBoundsException.class)
	public void testExceptionRemove() throws ListIndexOutOfBoundsException
	{
		threeElementsInOrder.get(threeElementsInOrder.size());
	}

	// add tests for iterating over the lists
	@Test
	public void testIterator()
	{
		Integer[] results =
		{ 5, 7, 3 };
		int i = 0;
		for (Integer item : threeElementsInOrder)
		{
			assertEquals(results[i], item);
			i++;
		}
	}

	@Test
	public void testIteratorSum()
	{
		int sum = 0;
		for (Integer item : threeElementsInOrder)
		{
			sum = sum + item;
		}
		assertEquals(15, sum);
	}

}