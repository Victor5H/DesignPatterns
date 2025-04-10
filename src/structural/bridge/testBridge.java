package structural.bridge;

public class testBridge {
    public static void main(String[] args) {
        YTVideoPlayer yt = new YTVideoPlayer(new K4VideoProcessor());
        yt.play("c://MyDoucments//chicken.mkv");
        MXPlayer mx = new MXPlayer(new K8VideoProcessor());
        mx.play("c://MyDoucments//chicken.mkv");
    }
}
