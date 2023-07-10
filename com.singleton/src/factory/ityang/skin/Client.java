package factory.ityang.skin;

public class Client {
    public static void main(String[] args) {
        Factory factory=new SummerFactory();
        factory.getButton().display_button();
        factory.getComboBox().display_comboBox();
        factory.getTextBox().display_textBox();
    }
}
