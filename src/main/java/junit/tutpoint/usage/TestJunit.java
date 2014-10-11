package junit.tutpoint.usage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit
{

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage()
	{
		/**
		 * <pre>
		 *  Hello World 
		 *  testPrintMessage(tutpoint.usage.TestJunit): expected:<[New Wor]d> but was:<[Hello Worl]d> 
		 *  false
		 * </pre>
		 *
		 */
		// message = "New World";

		assertEquals(message, messageUtil.printMessage());
	}
}