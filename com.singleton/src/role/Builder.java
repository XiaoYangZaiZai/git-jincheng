package role;

public interface Builder {
    public void buildFace();
    public void bulidClothes();
    public void buildSex();
    public void BuildHairStyle();
    public Role ReturnRole();
}

class AngelBuilder implements Builder{
    Role role=new Angel();
    @Override
    public void buildFace() {
        role.setFace("天使脸");
    }

    @Override
    public void bulidClothes() {
        role.setClothes("白裙子");
    }

    @Override
    public void buildSex() {
        role.setSex("女天使");
    }

    @Override
    public void BuildHairStyle() {
        role.setHairStyle("披肩的长发");
    }

    @Override
    public Role ReturnRole() {
        return role;
    }
}

class DemonBuilder implements Builder{
    Role role=new demon();
    @Override
    public void buildFace() {
        role.setFace("恶魔脸");
    }

    @Override
    public void bulidClothes() {
        role.setClothes("黑衣服");
    }

    @Override
    public void buildSex() {
        role.setSex("恶魔男");
    }

    @Override
    public void BuildHairStyle() {
        role.setHairStyle("光头");
    }

    @Override
    public Role ReturnRole() {
        return role;
    }
}