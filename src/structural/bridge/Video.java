package structural.bridge;

public abstract class Video {
    protected VideoProcessor videoProcessor;
    public Video(VideoProcessor videoProcessor){
        this.videoProcessor = videoProcessor;
    }
    public void play(String file){
        videoProcessor.process(file);
        System.out.println("Playing file "+file+" with processor "+videoProcessor);
    }
}
