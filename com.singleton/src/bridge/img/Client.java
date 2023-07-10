package bridge.img;

public class Client {
    public static void main(String[] args) {
        new ImgRunningInMacOS().setFileFix(new BMPFileFix()).show();
    }
}
