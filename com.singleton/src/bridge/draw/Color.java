package bridge.draw;
public interface Color{
}

class RedColor implements Color{
    public RedColor(){
        System.out.println("红色");
    }
}

class YellowColor implements Color{
    public YellowColor(){
        System.out.println("黄色");
    }
}
class BlueColor implements Color{
    public BlueColor(){
        System.out.println("蓝色");
    }
}
