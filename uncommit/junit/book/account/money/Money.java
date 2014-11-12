package junit.book.account.money;
public class Money
{
	private int amount;
	private String currnecy;

	public Money()
	{
		// TODO Auto-generated constructor stub
	}

	public Money(int amount, String currnecy)
	{
		this.amount = amount;
		this.currnecy = currnecy;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public String getCurrnecy()
	{
		return currnecy;
	}

	public void setCurrnecy(String currnecy)
	{
		this.currnecy = currnecy;
	}

}
