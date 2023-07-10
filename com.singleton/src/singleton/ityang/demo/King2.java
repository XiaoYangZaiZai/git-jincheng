package singleton.ityang.demo;

public class King2 {
    private static King2 king2 = null;
    private String name;

    private King2(String name) {
        this.name = name;
    }

    public static King2 getInstance(String name) {
        synchronized (King2.class) {
            if (king2 == null) {
                king2 = new King2(name);
            }
        }
        return king2;
    }
    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}