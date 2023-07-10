package cloth;

public class CivlianClothes太监 implements 尚衣监 {

    @Override
    public Cloth getCloth() {
        return new 总管公公(new WearByCivilianClothes太监()).construct();
    }
}
