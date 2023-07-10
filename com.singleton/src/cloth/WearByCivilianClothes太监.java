package cloth;

public class WearByCivilianClothes太监 implements Wear{
    Cloth civilianClothes =new CivilianClothes();


    @Override
    public void WearCap() {
        civilianClothes.setCap("便服的帽子");
    }

    @Override
    public void WearCoat() {
        civilianClothes.setCoat("便服的衣服");
    }

    @Override
    public void WearBoots() {
        civilianClothes.setBoots("便服的靴子");
    }

    @Override
    public Cloth WearOK() {
        return civilianClothes;
    }
}
