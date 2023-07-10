package decorator.visualcomponent;

public class ListComponent implements Component{
    @Override
    public void getComponentName(String type) {
        System.out.println(type+"列表框");
    }
}
