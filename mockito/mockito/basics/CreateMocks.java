package mockito.basics;
import java.util.ArrayList;
import java.util.Calendar;

import static org.mockito.Mockito.*;

public class CreateMocks
{
	public static void calendarExample()
	{
		Calendar mockedCalendar = mock(Calendar.class);
		when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020);

		System.out.println(mockedCalendar.get(Calendar.YEAR));
	}
	
	public static void arrayListExample()
	{
		ArrayList<String> mockArrayList = mock(ArrayList.class);
		when(mockArrayList.get(1)).thenReturn("mock - stubbing example :)");
		
		System.out.println(mockArrayList.get(1));
	}
	
	public static void main(String[] args)
	{
		//calendarExample();
		arrayListExample();
	}
}