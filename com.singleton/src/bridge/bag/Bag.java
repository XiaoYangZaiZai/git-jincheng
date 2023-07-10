package bridge.bag;

public abstract class Bag {
    Color color;
    public Bag setColor(Color color){
        this.color = color;
        return this;
    }
    public abstract void setType();
}
class Wallet extends Bag{

    @Override
    public void setType() {
        System.out.println("wallet");
    }
}

class HandBag extends Bag{
    public void setType(){
        System.out.println("HandBag");
    }
}