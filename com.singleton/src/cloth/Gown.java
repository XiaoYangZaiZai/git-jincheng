package cloth;

public class Gown implements Cloth{
    Empire empire = Empire.INSTANCE;
    private String cap;
    private String coat;
    private String boots;

    public Gown(String cap, String coat, String boots) {
        this.cap = cap;
        this.coat = coat;
        this.boots = boots;
    }

    public Gown() {
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
        return "Gown{" +
                "empire=" + empire +
                ", cap='" + cap + '\'' +
                ", coat='" + coat + '\'' +
                ", boots='" + boots + '\'' +
                '}';
    }
}
