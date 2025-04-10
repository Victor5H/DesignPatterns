package structural.bridge;

public class MXPlayer extends Video{
    public MXPlayer(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String file) {
        super.play(file);
    }
}
