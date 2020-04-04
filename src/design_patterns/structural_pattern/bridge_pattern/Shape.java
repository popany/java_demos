package design_patterns.structural_pattern.bridge_pattern;

public abstract class Shape {
	protected DrawApi drawApi;
	
	protected Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
	public abstract void draw();
}
