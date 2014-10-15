package mockito.basics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * 
 * <p>
 * 
 * <a href="http://2min2code.com/articles/mockito_intro/stubbing_method_sequential">http://2min2code.com/articles/
 * mockito_intro/stubbing_method_sequential</a>
 * 
 * @author BartBien
 *
 */
public class CreateMocks
{
	public static void stubCallendar()
	{
		Calendar mockedCalendar = mock(Calendar.class);
		when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020);

		System.out.println(mockedCalendar.get(Calendar.YEAR));
	}

	public static void stubArrayList()
	{
		ArrayList<String> mockArrayList = mock(ArrayList.class);
		when(mockArrayList.get(0)).thenReturn("mock - stubbing example :)");

		System.out.println(mockArrayList.get(0));
	}

	public static void stubList()
	{
		List myMockedList = mock(List.class);
		when(myMockedList.get(0)).thenReturn("target");

		System.out.println(myMockedList.get(0));
	}

	public static void listWithAnyArguments()
	{
		List myMockedList = mock(ArrayList.class);
		when(myMockedList.get(anyInt())).thenReturn(5);
		when(myMockedList.isEmpty()).thenReturn(false);

		System.out.println(myMockedList.get(2));
		System.out.println(myMockedList.isEmpty());
	}

	public static void stubForSequentialCalls()
	{
		List myMockedList = mock(List.class);
		// when(myMockedList.get(0)).thenReturn("target").thenReturn("others");
		when(myMockedList.get(0)).thenReturn("target", "others", "more");

		System.out.println(myMockedList.get(0));
		System.out.println(myMockedList.get(0));
		System.out.println(myMockedList.get(0));
	}

	public static void stubMethodToThrowException()
	{
		List myMockedList = mock(ArrayList.class);

		when(myMockedList.get(anyInt())).thenThrow(new NullPointerException());
		doThrow(new RuntimeException()).when(myMockedList).clear();

		System.out.println(myMockedList.get(1));
		myMockedList.clear();
	}

	public static void verifyStubbedMethod()
	{
		List myMockedList = mock(List.class);

		myMockedList.get(0);
		myMockedList.clear();

		verify(myMockedList).get(0);
		verify(myMockedList).clear();
	}

	public static void stubbedMethodFrequency()
	{
		List myMockedList = mock(List.class);
		myMockedList.clear();
		myMockedList.get(0);
		myMockedList.get(1);
		myMockedList.add("a");
		myMockedList.add("b");
		myMockedList.add("c");
		verify(myMockedList).clear();
		verify(myMockedList, times(1)).clear();
		verify(myMockedList, times(2)).get(anyInt());
		verify(myMockedList, times(3)).add(anyObject());
		verify(myMockedList, never()).remove(anyObject());
		verify(myMockedList, atLeast(2)).add(anyObject());
		verify(myMockedList, atMost(1)).clear();
	}

	public static void main(String[] args)
	{
		stubCallendar();
		// listWithAnyArguments();
		// stubForSequentialCalls();
		// stubMethodToThrowException();
		// verifyStubbedMethod();
		// stubbedMethodFrequency();
	}
}