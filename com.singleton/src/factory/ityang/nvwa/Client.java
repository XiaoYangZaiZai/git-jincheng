package factory.ityang.nvwa;

public class Client {
    public static void main(String[] args) {
        Factory factory = (Factory) XMLUtil.getBean("com.singleton//src//factory//ityang//nvwa//config.xml");
        factory.getPerson().display_person();

    }
}
