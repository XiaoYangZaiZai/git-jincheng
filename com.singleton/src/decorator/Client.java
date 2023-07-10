package decorator;

import org.dom4j.DocumentException;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

class Student {
    private String name;

    public Student(String name) {
        this.name = name.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Client {
    public static void main(String[] args) throws IOException, DocumentException {
//        (new UpperDecorator (new XMLDecorator(new FileLogger()))).decorate("abcdef");

    }
}
