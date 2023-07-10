package cloth;

public class 总管公公 {
    Wear wear;

    public 总管公公(Wear wear){
        this.wear = wear;
    }

    public Cloth construct(){
        wear.WearBoots();
        wear.WearCap();
        wear.WearCoat();
      return  wear.WearOK();
    }
}
