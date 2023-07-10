package singleton.ityang.demo;

public class Demo2 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(King5.KING_5)).start();
        new Thread(()-> System.out.println(King5.KING_5)).start();
    }
}
