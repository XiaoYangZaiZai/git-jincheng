package singleton.ityang.demo;

public class Demo {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(King4.getInstance("康熙"))).start();
        new Thread(()-> System.out.println(King4.getInstance("乾隆"))).start();
    }
}
