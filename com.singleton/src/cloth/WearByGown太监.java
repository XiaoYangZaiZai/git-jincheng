package cloth;

public class WearByGown太监 implements Wear{
    Cloth gown =new Gown();
    @Override
    public void WearCap() {
        gown.setCap("礼服的帽子");
    }

    @Override
    public void WearCoat() {
        gown.setCoat("礼服的衣服");
    }

    @Override
    public void WearBoots() {
        gown.setBoots("礼服的靴子");
    }

    @Override
    public Cloth WearOK() {
        return gown;
    }
}
