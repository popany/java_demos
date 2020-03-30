package design_patterns.creational_pattern.abstract_factory_pattern;

import design_patterns.creational_pattern.factory_pattern.Shape;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}
