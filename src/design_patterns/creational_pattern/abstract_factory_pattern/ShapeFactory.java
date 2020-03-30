package design_patterns.creational_pattern.abstract_factory_pattern;

import design_patterns.creational_pattern.factory_pattern.Shape;
import design_patterns.creational_pattern.factory_pattern.Rectangle;
import design_patterns.creational_pattern.factory_pattern.Square;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
}
