

/**
 * Main interface for all list implementation. Like ArrayList, LinkedList ~
 * 
 * @author Bart88
 *
 * @param <E>
 */
public interface List<E>
{
	/**
	 * Append the specified element to the end of list.
	 * 
	 * @param element
	 */
	void add(E element);

	/**
	 * Insert the specified element to the specified position.
	 * 
	 * @param index
	 * @param element
	 */
	void add(int index, E element);

	/**
	 * Return the element at the specified position.
	 * 
	 * @param index
	 */
	E get(int index);

	/**
	 * Replace the element at the position within specified element.
	 * 
	 * @param index
	 * @param element
	 */
	void set(int index, E element);

	/**
	 * Remove the element at the specified position.
	 * 
	 * @param index
	 */
	void remove(int index);

	/**
	 * Return true if list is empty.
	 * 
	 * @return
	 */
	boolean isEmpty();

	/**
	 * Return the number of elements in list.
	 * 
	 * @return
	 */
	int size();
}
