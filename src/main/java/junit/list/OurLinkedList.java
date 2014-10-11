package junit.list;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E>
{
	private Node first;
	private int size = 0;

	public OurLinkedList()
	{
		first = null; // list is created empty
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return (first == null);
	}

	/**
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		return size;
	}

	/**
	 * Inserts the specified element at the specified index in this list
	 *
	 * @param index
	 *            - the index where to insert the element
	 * @param item
	 *            - the item to be inserted
	 * @throws ListIndexOutOfBoundsException
	 *             - if the index is out of range (index < 0 || index > size()).
	 */
	@Override
	public void add(int index, E item) throws ListIndexOutOfBoundsException
	{
		Node newNode = new Node(item, null);
		Node currentNode = first;
		if (index < 0)
		{
			throw new ListIndexOutOfBoundsException("Index " + index + " is invalid in a list of size " + size);
		}
		else if (index == 0)
		{
			newNode.next = currentNode;
			first = newNode;
			size++;
		}
		else
		{
			for (int i = 0; i < index - 1; i++)
			{
				// stops at the node before the index, so that the new node could be attached to it
				if (currentNode == null)
				{
					throw new ListIndexOutOfBoundsException("Index " + index + " is invalid in a list of size " + size);
				}
				currentNode = currentNode.next;
			}
			Node nextNode = currentNode.next;
			currentNode.next = newNode;
			newNode.next = nextNode;
			size++;
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 *
	 * @param index
	 *            - the index of the element to be returned
	 * @return - the element in the given position in this list.
	 *
	 * @param index
	 *            - the index of the element to be returned
	 * @return - the element at the specified position in this list.
	 * @throws ListIndexOutOfBoundsException
	 *             - if the index is out of range (index < 0 || index >= size()).
	 */
	@Override
	public E get(int index) throws ListIndexOutOfBoundsException
	{
		if (index >= size)
		{
			throw new ListIndexOutOfBoundsException("Index: " + index + " is out of bounds! The list is only " + size + " element(s) long!");
		}
		else if (index < 0)
		{
			throw new ListIndexOutOfBoundsException("Index cannot be negative: " + index);
		}
		else
		{
			Node currentNode = first;

			for (int i = 0; i < index; i++)
			{
				currentNode = currentNode.next;
			}

			return currentNode.element;
		}
	}

	/**
	 * Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts
	 * one from their indices).
	 *
	 * @param index
	 *            - the index of the element to removed.
	 * @throws ListIndexOutOfBoundsException
	 *             - if the index is out of range (index < 0 || index >= size()).
	 */
	@Override
	public void remove(int index) throws ListIndexOutOfBoundsException
	{
		if ((size == 0) || (size <= index))
		{
			throw new ListIndexOutOfBoundsException("Trying to remove a non-existent element.");
		}
		if (index == 0)
		{
			first = first.next;
			size--;
		}
		else
		{
			Node previousNode = first;
			int i = 1;
			while (i < index)
			{
				previousNode = previousNode.next;
				i++;
			}
			previousNode.next = previousNode.next.next;
			size--;
		}
	}

	/**
	 * Removes all of the elements from this list (optional operation). This list will be empty after this call returns.
	 *
	 * @return
	 */
	@Override
	public void clear()
	{
		first = null;
		size = 0;
	}

	private class Node
	{
		private E element;
		private Node next;

		public Node(E element, Node next)
		{
			this.element = element;
			this.next = next;
		}

	}

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		// return null;
		return new ListIterator();
	}

	// added the iterator class
	private class ListIterator implements Iterator<E>
	{

		@Override
		public boolean hasNext()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next()
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException();
		}

	}

}