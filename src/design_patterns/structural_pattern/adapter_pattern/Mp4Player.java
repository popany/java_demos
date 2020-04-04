package design_patterns.structural_pattern.adapter_pattern;

public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		// do nothing
	}
	
	@Override
	public void playMp4(String fileName) {
		System.out.println("playing mp4 file. Name: " + fileName);
	}
}