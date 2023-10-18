public class offensifEquipement {
    private String weapon;
    private String Sort;
    private int attackLevel;
    private String name;
    public offensifEquipement(String weapon, int attackLevel, String name) {
        this.weapon = weapon;
        this.attackLevel = attackLevel;
        this.name = name;

    }



    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        weapon = weapon;
    }

    public String getSort() {
        return Sort;
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

