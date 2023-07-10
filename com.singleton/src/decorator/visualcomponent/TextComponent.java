package decorator.visualcomponent;

public class TextComponent implements Component{
    @Override
    public void getComponentName(String type) {
        System.out.println(type+"文本框");
    }
}
