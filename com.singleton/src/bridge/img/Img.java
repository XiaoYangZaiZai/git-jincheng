package bridge.img;

public abstract class Img {
    FileFix fileFix;
    public Img setFileFix(FileFix fileFix){
        this.fileFix = fileFix;
        fileFix.parse();
        return this;
    }
    public abstract void show();
}

class ImgRunningInWindows extends Img{
    public void show(){
        System.out.println("windows img");
    }
}

class ImgRunningInMacOS extends Img{
    public void show(){
        System.out.println("MacOS img");
    }
}