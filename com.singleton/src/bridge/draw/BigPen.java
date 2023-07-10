package bridge.draw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Pen {
    Color color;
    public abstract void draw();
    public Pen setColor(Color color) {
        this.color = color;
        return this;
    }
}

class BigPen extends Pen {
    public void draw() {
        System.out.println("大号笔画画");
    }
}

class MiddlePen extends Pen {
    public void draw() {
        System.out.println("中号笔画画");
    }
}

class SmallPen extends Pen {
    public void draw() {
        System.out.println("小号笔画画");
    }
}

class Client {
    public static void main(String[] args) {
        new SmallPen().setColor(new BlueColor()).draw();

    }
}