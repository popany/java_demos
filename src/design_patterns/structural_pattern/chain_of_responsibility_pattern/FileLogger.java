package design_patterns.structural_pattern.chain_of_responsibility_pattern;

public class FileLogger extends AbstractLogger {
	
	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("File::logger: " + message);
	}
}
