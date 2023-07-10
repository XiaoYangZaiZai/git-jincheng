package role;

public interface Role {
    void setFace(String face);

    void setHairStyle(String hairStyle);

    void setClothes(String clothes);

    void setSex(String sex);

}

class Angel implements Role{

    private String face;
    private String hairStyle;
    private String clothes;
    private String sex;

    public Angel() {
    }

    public Angel(String face, String hairStyle, String clothes, String sex) {
        this.face = face;
        this.hairStyle = hairStyle;
        this.clothes = clothes;
        this.sex = sex;
    }

    /**
     * 获取
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     * @param face
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取
     * @return hairStyle
     */
    public String getHairStyle() {
        return hairStyle;
    }

    /**
     * 设置
     * @param hairStyle
     */
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    /**
     * 获取
     * @return clothes
     */
    public String getClothes() {
        return clothes;
    }

    /**
     * 设置
     * @param clothes
     */
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Angel{face = " + face + ", hairStyle = " + hairStyle + ", clothes = " + clothes + ", sex = " + sex + "}";
    }
}
class demon implements Role{
    private String face;
    private String hairStyle;
    private String clothes;
    private String sex;

    public demon() {
    }

    public demon(String face, String hairStyle, String clothes, String sex) {
        this.face = face;
        this.hairStyle = hairStyle;
        this.clothes = clothes;
        this.sex = sex;
    }

    /**
     * 获取
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     * @param face
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取
     * @return hairStyle
     */
    public String getHairStyle() {
        return hairStyle;
    }

    /**
     * 设置
     * @param hairStyle
     */
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    /**
     * 获取
     * @return clothes
     */
    public String getClothes() {
        return clothes;
    }

    /**
     * 设置
     * @param clothes
     */
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "demon{face = " + face + ", hairStyle = " + hairStyle + ", clothes = " + clothes + ", sex = " + sex + "}";
    }
}