package cloth;

public enum Empire {
    INSTANCE("单例皇帝");

    private String name;
    private Empire(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Empire{" +
                "name='" + name + '\'' +
                '}';
    }
}
