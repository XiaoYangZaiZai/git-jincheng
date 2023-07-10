package proxy.demo;

public class Cilent {
    public static void main(String[] args) {
        AbstractUserDao o =(AbstractUserDao) new DAOLogHandler(new UserDao()).getProxy();
        o.msg();
    }
}
