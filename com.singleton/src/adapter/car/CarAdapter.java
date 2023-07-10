package adapter.car;

public class CarAdapter implements Car{
    CarAdaptee carAdaptee = new CarAdaptee();

    private void init(){
        System.out.println("初始化操作");
    }
    public void flashing(){
        carAdaptee.blink();
    }
   public void siren(){
        carAdaptee.hearing();
    }



   public void move(){
        this.init();
        this.flashing();
        this.siren();
    }
}
