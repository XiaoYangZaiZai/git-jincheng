package factory.ityang.skin;

public interface ComboBox {
    void display_comboBox();
}

class SpringComboBox implements ComboBox{

    @Override
    public void display_comboBox() {
        System.out.println("浅绿色的组合框");
    }

    public SpringComboBox() {
    }
}

class SummerComboBox implements ComboBox{

    @Override
    public void display_comboBox() {
        System.out.println("浅蓝色的组合框");
    }

    public SummerComboBox() {
    }
}