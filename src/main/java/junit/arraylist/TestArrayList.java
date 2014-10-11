package junit.arraylist;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class TestArrayList
{

	@Test
	public void testEmptyArrayList()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		assertEquals(al.size(), 0);
	}

	@Test
	public void testIntArrayList()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(-14);
		al.add(29);
		assertEquals(al.size(), 3);
		assertEquals(al.get(0), (Object) 5);
		assertEquals(al.get(1), Integer.valueOf(-14));
		assertEquals(al.get(2), (Object) 29);
	}

	@Test
	public void testDoubleArrayList()
	{
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(5.9);
		al.add(-14.26789);
		al.add(29.0);
		al.add(0.00456);
		assertEquals(al.size(), 4);
		assertEquals(al.get(0), 5.9, 0.001);
		assertEquals(al.get(1), -14.26789, 0.001);
		assertEquals(al.get(2), 29.0, 0.001);
		assertEquals(al.get(3), 0.00456, 0.00001);
	}

}