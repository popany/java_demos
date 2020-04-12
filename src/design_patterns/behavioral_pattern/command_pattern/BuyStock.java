package design_patterns.behavioral_pattern.command_pattern;

public class BuyStock implements Order {
	private Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		stock.buy();
	}
}
