package factory.ityang.skin;

public interface TextBox {
    void display_textBox();
}

class SpringTextBox implements TextBox{

    @Override
    public void display_textBox() {
        System.out.println("浅绿色的文本框");
    }

    public SpringTextBox() {
    }
}

class SummerTextBox implements TextBox{

    @Override
    public void display_textBox() {
        System.out.println("浅蓝色的文本框");
    }

    public SummerTextBox() {
    }
}