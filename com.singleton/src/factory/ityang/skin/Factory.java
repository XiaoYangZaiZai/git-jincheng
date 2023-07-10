package factory.ityang.skin;

public abstract class Factory {
    abstract ComboBox getComboBox();
    abstract Button getButton();
    abstract TextBox getTextBox();
}

class SpringFactory extends Factory {
    ComboBox getComboBox(){
        return new SpringComboBox();
    }
    Button getButton(){
        return new SpringButton();
    }
    TextBox getTextBox(){
        return new SpringTextBox();
    }
}

class SummerFactory extends Factory {
    ComboBox getComboBox(){
        return new SummerComboBox();
    }
    Button getButton(){
        return new SummerButton();
    }
    TextBox getTextBox(){
        return new SummerTextBox();
    }
}