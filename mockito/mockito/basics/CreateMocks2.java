package mockito.basics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import org.mockito.Mock;

public class CreateMocks2
{
	public static void stubCallendar()
	{
		Calendar mockedCalendar = mock(Calendar.class);
		when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020);

		System.out.println(mockedCalendar.get(Calendar.YEAR));
	}

	public static void stubList()
	{
		@SuppressWarnings("unchecked")
		ArrayList<String> list = mock(ArrayList.class);

		when(list.get(0)).thenReturn("index 0");

		System.out.println(list.get(0));
	}

	public static void stubLinkedList()
	{
		// You can mock concrete classes, not only interfaces
		@SuppressWarnings("rawtypes")
		LinkedList mockedList = mock(LinkedList.class);

		// stubbing
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());

		// following prints "first"
		System.out.println(mockedList.get(0));

		// following throws runtime exception
		//System.out.println(mockedList.get(1));

		// following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));
		

//		 //stubbing using built-in anyInt() argument matcher
//		 when(mockedList.get(anyInt())).thenReturn("element");
//		 
//		 //stubbing using hamcrest (let's say isValid() returns your own hamcrest matcher):
//		 when(mockedList.contains(argThat(isValid()))).thenReturn("element");
//		 
//		 //following prints "element"
//		 System.out.println(mockedList.get(999));
//		 
//		 //you can also verify using an argument matcher
//		 verify(mockedList).get(anyInt());


	}

	public static void main(String[] args)
	{
		stubLinkedList();
	}
}
