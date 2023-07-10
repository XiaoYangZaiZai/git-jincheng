package singleton.ityang.thread;

public class Demo {
    public static void main(String[] args) {
        Cook cook=new Cook();
        Foodie foodie= new Foodie();
        cook.start();
        foodie.start();
    }

}
