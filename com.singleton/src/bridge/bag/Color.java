package bridge.bag;

public interface Color {
}

class YellowColor implements Color{
    YellowColor(){
        System.out.println("yellow");
    }
}
class RedColor implements Color{
    RedColor(){
        System.out.println("red");
    }
}