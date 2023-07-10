package singleton.ityang.demo;

import java.io.Serializable;

public class King3 implements Serializable{
    private static volatile King3 king3 = null;
    private String name;

    private King3(String name) {
        this.name = name;
    }

    public static King3 getInstance(String name) {
        if (king3 == null) {
            synchronized (King3.class) {
                if (king3 == null) {
                    king3 = new King3(name);
                }
            }
        }
        return king3;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}