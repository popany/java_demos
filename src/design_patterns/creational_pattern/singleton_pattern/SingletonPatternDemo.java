package design_patterns.creational_pattern.singleton_pattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();
		
		singleObject.showMessage();
	}
}
