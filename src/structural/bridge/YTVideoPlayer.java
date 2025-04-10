package structural.bridge;

public class YTVideoPlayer extends Video{
    public YTVideoPlayer(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String file) {
        super.play(file);
    }
}
