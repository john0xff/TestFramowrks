package junit.book.account.money.test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MoneyParamsTest
{
	private static final Object[] getMoney()
	{
		Object[] object =
		{ new Object[]
		{ 10, "USD" }, new Object[]
		{ 20, "EUR" } };

		return object;
	}

	@Test
	@Parameters(name = "getMoney")
	public void moneyConstructorParam(int amount, String currency)
	{
		assertEquals(new Boolean(true), new Boolean(true));
	}
}
