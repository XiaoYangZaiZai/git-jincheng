package role;

public class Director {
    Builder builder;
    Director(Builder builder){
       this.builder=builder;
    }
    Role Construct(){
        builder.buildFace();
        builder.BuildHairStyle();
        builder.buildSex();
        builder.bulidClothes();
        return builder.ReturnRole();
    }
}


