package demo;

import java.io.InputStream;

public class ClassLoader {
    public static void main(String[] args) {
        java.lang.ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("com.singleton//src//demo//config.xml");
        System.out.println(resourceAsStream);
    }
}
