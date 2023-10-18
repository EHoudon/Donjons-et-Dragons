public class defensifEquipement {
    private String Shield;
    private String Philter;
    private int levelDefense;
    private String name;
    public defensifEquipement(String Shield, int levelDefense, String name) {
        this.Shield = Shield;
        this.levelDefense = levelDefense;
        this.name = name;

    }

    public String getShield() {
        return Shield;
    }

    public void setShield(String shield) {
        Shield = shield;
    }

    public String getPhilter() {
        return Philter;
    }

    public void setPhilter(String philter) {
        Philter = philter;
    }

    public int getLevelDefense() {
        return levelDefense;
    }

    public void setLevelDefense(int levelDefense) {
        this.levelDefense = levelDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
