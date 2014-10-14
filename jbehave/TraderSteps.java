import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TraderSteps
{ // look, Ma, I'm a POJO!!

	private Stock stock;

	@Given("a stock of symbol $symbol and a threshold of $threshold")
	public void aStock(String symbol, double threshold)
	{
		stock = new Stock(symbol, threshold);
	}

	@When("the stock is traded at $price")
	public void theStockIsTradedAt(double price)
	{
		stock.tradeAt(price);
	}

	@Then("the alert status should be $status")
	public void theAlertStatusShouldBe(String status)
	{
		//ensureThat(stock.getStatus().name(), equalTo(status));
	}

}