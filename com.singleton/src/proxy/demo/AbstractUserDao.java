package proxy.demo;

public interface  AbstractUserDao {
     void msg();
}

class UserDao implements AbstractUserDao{

    @Override
    public void msg() {
        System.out.println("userdao method 被调用");
    }
}
