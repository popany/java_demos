package design_patterns.behavioral_pattern.command_pattern;

public class SellStock implements Order {
	private Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		stock.sell();
	}
}
