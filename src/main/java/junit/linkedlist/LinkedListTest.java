package junit.linkedlist;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListTest
{

	@Test
	public void testLinkedList()
	{
		Integer[] objects =
		{ 5, 8, 7, 10 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
		assertEquals(4, list.size());
	}

	@Test
	public void testIterator()
	{
		Integer[] objects =
		{ 5, 8, 7, 10 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));

		int index = 0;
		for (Integer value : list)
		{
			assertEquals(list.get(index), value);
			index++;
		}
		assertEquals(index, list.size());
	}

	@Test
	public void testGetAddSize()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());

		list.add(47);
		assertEquals(47, (int) list.get(0));
		assertEquals(1, list.size());

		list.add(65);
		assertEquals(47, (int) list.get(0));
		assertEquals(65, (int) list.get(1));
		assertEquals(2, list.size());
	}

	@Test
	public void testSet()
	{
		Integer[] objects =
		{ 5, 8, 7, 10 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
		assertEquals(4, list.size());

		assertEquals(10, (int) list.get(3));
		list.set(3, 12);
		assertEquals(12, (int) list.get(3));
	}

	@Test
	public void testIndexOf()
	{
		Integer[] objects =
		{ 5, 8, 7, 8, 10 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
		assertEquals(5, list.size());

		assertEquals(0, list.indexOf(5));
		assertEquals(1, list.indexOf(8));
		assertEquals(2, list.indexOf(7));
		assertEquals(4, list.indexOf(10));
	}

	@Test
	public void testAddAll()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());

		Integer[] objects =
		{ 5, 8, 7, 10 };
		list.addAll(Arrays.asList(objects));
		assertEquals(4, list.size());

		for (int i = 0; i < objects.length; i++)
		{
			assertEquals(objects[i], list.get(i));
		}
	}

	/**
	 * Inserts the specified element at the specified position in this list.
	 */
	@Test
	public void testInsert()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		assertEquals(0, list.size());

		list.add(0, 3);
		assertEquals(1, list.size());
		assertEquals(3, (int) list.get(0));

		list.add(0, 2);
		assertEquals(2, list.size());
		assertEquals(2, (int) list.get(0));
		assertEquals(3, (int) list.get(1));

		list.add(2, 4);
		assertEquals(3, list.size());
		assertEquals(2, (int) list.get(0));
		assertEquals(3, (int) list.get(1));
		assertEquals(4, (int) list.get(2));

		list.add(1, 8);
		assertEquals(4, list.size());
		assertEquals(2, (int) list.get(0));
		assertEquals(8, (int) list.get(1));
		assertEquals(3, (int) list.get(2));
		assertEquals(4, (int) list.get(3));
	}

	@Test
	public void testRemoveAt()
	{
		Integer[] objects =
		{ 5, 8, 7, 8, 10 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
		assertEquals(5, list.size());

		// test head removal
		Integer removedValue = list.remove(0);
		assertEquals(4, list.size());
		assertEquals(5, (int) removedValue);
		assertEquals(8, (int) list.get(0));
		assertEquals(7, (int) list.get(1));

		// test intermediate removal
		removedValue = list.remove(1);
		assertEquals(3, list.size());
		assertEquals(7, (int) removedValue);
		assertEquals(8, (int) list.get(0));
		assertEquals(8, (int) list.get(1));
		assertEquals(10, (int) list.get(2));

		// test tail removal
		removedValue = list.remove(2);
		assertEquals(2, list.size());
		assertEquals(10, (int) removedValue);
		assertEquals(8, (int) list.get(0));
		assertEquals(8, (int) list.get(1));
	}

//	@Test
//	public void testRemove()
//	{
//		Integer[] objects =
//		{ 5, 4, 8, 7, 6, 8, 10 };
//		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
//		assertEquals(7, list.size());
//
//		// test head removal
//		Integer removedValue = list.remove(5);
//		assertEquals(6, list.size());
//		assertEquals(5, (int) removedValue);
//		assertEquals(4, (int) list.get(0));
//		assertEquals(8, (int) list.get(1));
//
//		// test intermediate removal
//		removedValue = list.remove(7);
//		assertEquals(5, list.size());
//		assertEquals(7, (int) removedValue);
//		assertEquals(8, (int) list.get(1));
//		assertEquals(6, (int) list.get(2));
//
//		// test tail removal
//		removedValue = list.remove(10);
//		assertEquals(4, list.size());
//		assertEquals(10, (int) removedValue);
//		assertEquals(4, (int) list.get(0));
//		assertEquals(8, (int) list.get(1));
//		assertEquals(6, (int) list.get(2));
//		assertEquals(8, (int) list.get(3));
//
//		// test duplicate removal
//		removedValue = list.remove(8);
//		assertEquals(3, list.size());
//		assertEquals(8, (int) removedValue);
//		assertEquals(4, (int) list.get(0));
//		assertEquals(6, (int) list.get(1));
//		assertEquals(8, (int) list.get(2));
//
//		removedValue = list.remove(8);
//		assertEquals(2, list.size());
//		assertEquals(8, (int) removedValue);
//		assertEquals(4, (int) list.get(0));
//		assertEquals(6, (int) list.get(1));
//	}

//	@Test
//	public void trimToSize()
//	{
//		Integer[] objects =
//		{ 5, 4, 8, 7, 6, 8, 10 };
//		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(objects));
//		assertEquals(7, list.size());
//
//		
//		list.trimToSize(4);
//		assertEquals(4, list.size());
//		int counter = 0;
//		for (Integer i : list)
//		{
//			counter++;
//		}
//		assertEquals(4, counter);
//
//		list.trimToSize(0);
//		assertEquals(0, list.size());
//		counter = 0;
//		for (Integer i : list)
//		{
//			counter++;
//		}
//		assertEquals(0, counter);
//	}
}