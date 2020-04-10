package design_patterns.structural_pattern.proxy_pattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("image file");
		
		image.display();
		image.display();
	}
}
