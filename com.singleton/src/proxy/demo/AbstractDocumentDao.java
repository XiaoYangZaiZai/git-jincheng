package proxy.demo;

public interface  AbstractDocumentDao {
     void msg();
}

class DocumentDao implements AbstractUserDao{

    @Override
    public void msg() {
        System.out.println("documentdao method 被调用");
    }
}
