package cloth;

public class CivilianClothes implements Cloth{
    private String cap;
    private String coat;
    private String boots;
    Empire empire = Empire.INSTANCE;

    public CivilianClothes(String cap, String coat, String boots) {
        this.cap = cap;
        this.coat = coat;
        this.boots = boots;
    }

    public CivilianClothes() {
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    @Override
    public String toString() {
        return "CivilianClothes{" +
                "cap='" + cap + '\'' +
                ", coat='" + coat + '\'' +
                ", boots='" + boots + '\'' +
                ", empire=" + empire +
                '}';
    }
}
