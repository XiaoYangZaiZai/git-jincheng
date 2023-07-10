package singleton.ityang.lazy;

public class demo2 {
    public static void main(String[] args) {
        new Thread(()->System.out.println(LazySingleton4.getInstance())
        ).start();
        new Thread(()->System.out.println(LazySingleton4.getInstance())
        ).start();
    }
}
