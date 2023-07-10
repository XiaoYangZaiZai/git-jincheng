package singleton.ityang.lazy.president3;

class President {
    private static President president;

    private President(String name) {
        this.name = name;
    }

    private String name;

    public static President getInstance(String name) {
        synchronized (President.class) {
            if (president == null) {
                president = new President(name);
            }
        }
        return president;
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class PresidentDemo {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(President.getInstance("拜登").toString())).start();
        new Thread(() -> System.out.println(President.getInstance("拜登").toString())).start();
    }
}
