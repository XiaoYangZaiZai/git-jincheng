package singleton.ityang;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}

/**
 * 1.构造方法私有化
 * 2.私有的静态的且为自身的成员变量
 * 3.提供公有的静态成员方法，返回类的唯一实例
 */
class Singleton {
    private static Singleton singleton;//成员变量是自身

    private Singleton() {
    }
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    public void pizouzhang() {
        System.out.println("批奏章");
    }
}