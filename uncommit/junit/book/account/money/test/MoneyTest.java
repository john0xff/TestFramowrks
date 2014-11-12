package junit.book.account.money.test;

import junit.book.account.money.Money;

import org.junit.Test;

public class MoneyTest
{
	@Test
	public void moneyConstructorParam()
	{
		Money money = new Money(30, "EURO");

		junit.framework.Assert.assertEquals(10, money.getAmount());
		junit.framework.Assert.assertEquals("EURO", money.getCurrnecy());
	}
}
