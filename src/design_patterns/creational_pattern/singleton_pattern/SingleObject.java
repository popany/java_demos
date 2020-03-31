package design_patterns.creational_pattern.singleton_pattern;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
