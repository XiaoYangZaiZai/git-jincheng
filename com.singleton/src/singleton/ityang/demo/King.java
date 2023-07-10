package singleton.ityang.demo;

public class King {
    private static King king =null;
    private String name;
    private King(String name){
        this.name=name;
    }
    public static King getInstance(String name){
        if(king==null){
            king=new King(name);
        }
        return king;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}
