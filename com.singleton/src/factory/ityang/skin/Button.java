package factory.ityang.skin;

public interface Button {
    void display_button();
}

class SpringButton implements Button{

    @Override
    public void display_button() {
        System.out.println("浅绿色的按钮");
    }

    public SpringButton() {
    }
}

class SummerButton implements Button{

    @Override
    public void display_button() {
        System.out.println("浅蓝色的按钮");
    }

    public SummerButton() {
    }
}