package decorator.visualcomponent;

public class WindowComponent implements Component{

    @Override
    public void getComponentName(String type) {
        System.out.println(type+"窗体");
    }
}
