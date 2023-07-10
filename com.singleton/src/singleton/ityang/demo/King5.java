package singleton.ityang.demo;

public enum King5 {
    KING_5("康熙");
    private final String name ;
    private King5(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}
